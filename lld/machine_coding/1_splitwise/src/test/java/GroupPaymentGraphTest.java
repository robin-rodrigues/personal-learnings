import models.*;
import org.junit.Assert;
import org.junit.Test;
import services.ExpenseService;
import services.GroupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupPaymentGraphTest {

    @Test
    public void defaultTest() throws IllegalAccessException {
        final ExpenseService expenseService = constructExpenseService1();
        final HashMap<String, Group> groups = getGroups();
        GroupService groupService = new GroupService(expenseService, groups);
        final BalanceMap balances = groupService.getBalances("123", "A");
        final Map<String, Amount> balanceMap = balances.getBalances();
        Assert.assertEquals(50.0, balanceMap.get("A").getAmount(), 0.0001);
        Assert.assertEquals(30.0, balanceMap.get("B").getAmount(), 0.0001);
        Assert.assertEquals(-80.0, balanceMap.get("C").getAmount(), 0.0001);
        System.out.println(balanceMap);
    }

    @Test
    public void paymentGraphTest() throws IllegalAccessException {
        final ExpenseService expenseService = constructExpenseService2();
        final HashMap<String, Group> groups = getGroups();
        GroupService groupService = new GroupService(expenseService, groups);
        final PaymentGraph balances = groupService.getGroupPaymentGraph("123", "A");
        final Map<String, BalanceMap> graph = balances.getGraph();
        Assert.assertEquals(90.0, graph.get("A").getBalances().get("E").getAmount(), 0.0001);
        Assert.assertEquals(70.0, graph.get("D").getBalances().get("B").getAmount(), 0.0001);
        Assert.assertEquals(40.0, graph.get("F").getBalances().get("C").getAmount(), 0.0001);
        Assert.assertEquals(10.0, graph.get("D").getBalances().get("E").getAmount(), 0.0001);
        System.out.println(graph);
    }

    private HashMap<String, Group> getGroups() {
        final var groups = new HashMap<String, Group>();
        final var userList = new ArrayList<String>();
        userList.add("A");
        userList.add("B");
        userList.add("C");
        groups.put("123", new Group("Europe", "Euro trip", "www.robin.com",
                userList));
        return groups;
    }

    private ExpenseService constructExpenseService1() {
        final ExpenseService expenseService = new ExpenseService();

        final BalanceMap firstExpense = new BalanceMap();
        firstExpense.getBalances().put("A", new Amount(Currency.USD, 10));
        firstExpense.getBalances().put("B", new Amount(Currency.USD, 20));
        firstExpense.getBalances().put("C", new Amount(Currency.USD, -30));
        expenseService.addExpense(new Expense(firstExpense,
                "outing1", "www.robin.com", "outing 1", "123"));

        final BalanceMap secondExpense = new BalanceMap();
        secondExpense.getBalances().put("A", new Amount(Currency.USD, -50));
        secondExpense.getBalances().put("B", new Amount(Currency.USD, 10));
        secondExpense.getBalances().put("C", new Amount(Currency.USD, 40));
        expenseService.addExpense(new Expense(secondExpense,
                "outing2", "www.robin.com", "outing 2", "123"));

        final BalanceMap thirdExpense = new BalanceMap();
        thirdExpense.getBalances().put("A", new Amount(Currency.USD, 90));
        thirdExpense.getBalances().put("C", new Amount(Currency.USD, -90));
        expenseService.addExpense(new Expense(thirdExpense,
                "outing3", "www.robin.com", "outing 3", "123"));

        return expenseService;
    }

    public ExpenseService constructExpenseService2() {
        final ExpenseService expenseService = new ExpenseService();

        final BalanceMap firstExpense = new BalanceMap();
        firstExpense.getBalances().put("A", new Amount(Currency.USD, 90));
        firstExpense.getBalances().put("B", new Amount(Currency.USD, -70));
        firstExpense.getBalances().put("C", new Amount(Currency.USD, -40));
        firstExpense.getBalances().put("D", new Amount(Currency.USD, 80));
        firstExpense.getBalances().put("E", new Amount(Currency.USD, -100));
        firstExpense.getBalances().put("F", new Amount(Currency.USD, 40));

        expenseService.addExpense(new Expense(firstExpense,
                "outing1", "www.robin.com", "outing 1", "123"));

        return expenseService;
    }
}
