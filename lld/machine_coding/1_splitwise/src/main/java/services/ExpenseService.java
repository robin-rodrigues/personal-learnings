package services;

import models.Amount;
import models.BalanceMap;
import models.Expense;
import models.PaymentGraph;

import java.util.*;

import static models.Currency.USD;

public class ExpenseService {
    // select * from expenses where group_id = 'groupId'
    private final Map<String, List<Expense>> groupExpenses;

    public ExpenseService() {
        this.groupExpenses = new HashMap<>();
    }

    public void addExpense(Expense expense) {
        final String groupId = expense.getGroupId();

        if(groupId != null) {
            groupExpenses.putIfAbsent(groupId, new ArrayList<>());
            groupExpenses.get(groupId).add(expense);
        }
    }

    public List<Expense> getGroupExpenses(String groupId) {
        return groupExpenses.get(groupId);
    }

    // ALGORITHM
    public PaymentGraph getPaymentGraph(BalanceMap groupBalances) {
        final Comparator<Map.Entry<String, Amount>> ascending = Comparator.comparingDouble(balance -> balance.getValue().getAmount());
        final PriorityQueue<Map.Entry<String, Amount>>
                positiveAmounts = new PriorityQueue<>(ascending.reversed()),
                negativeAmounts = new PriorityQueue<>(ascending);

        for(Map.Entry<String, Amount> balance : groupBalances.getBalances().entrySet()) {
            if(balance.getValue().getAmount() > 0) {
                positiveAmounts.add(balance);
            } else {
                negativeAmounts.add(balance);
            }
        }

        final HashMap<String, BalanceMap> graph = new HashMap<String, BalanceMap>();

        while(!positiveAmounts.isEmpty() && !negativeAmounts.isEmpty()) {
            //eliminate largest from both groups
            final Map.Entry<String, Amount> largestPositive = positiveAmounts.poll();
            final Map.Entry<String, Amount> largestNegative = negativeAmounts.poll();
            final double positiveAmount = largestPositive.getValue().getAmount();
            final double negativeAmount = -largestNegative.getValue().getAmount();

            graph.putIfAbsent(largestPositive.getKey(), new BalanceMap());
            graph.get(largestPositive.getKey()).getBalances()
                    .put(largestNegative.getKey(), new Amount(USD, Math.min(positiveAmount, negativeAmount)));

            double remaining = positiveAmount - negativeAmount;
            final var remainingAmount = new Amount(USD, remaining);

            if(remaining > 0) {
                positiveAmounts.add(new AbstractMap.SimpleEntry<>(largestPositive.getKey(), remainingAmount));
            } else if (remaining < 0) {
                negativeAmounts.add(new AbstractMap.SimpleEntry<>(largestNegative.getKey(), remainingAmount));
            }
        }

        return new PaymentGraph(graph);
    }
}
