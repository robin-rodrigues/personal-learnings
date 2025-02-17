public class InterpreterExample {
    public static void main(String[] args) {
        // Initialize the context
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 4);

        // Expression
        AbstractExpression expression1 = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"),
                new NumberTerminalExpression("b")
        );

        System.out.println(expression1.interpret(context));
    }
}