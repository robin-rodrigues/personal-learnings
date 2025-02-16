public class Level3SupportHandler implements SupportHandler {
    SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        // No next handler for Level 3
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println(request + " inside Level3SupportHandler");

        if(request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 support handled the request");
        } else {
            System.out.println(request + " cannot be handled.");
        }
    }
}
