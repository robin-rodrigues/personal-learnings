public class Level1SupportHandler implements SupportHandler {
    SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println(request + " inside Level1SupportHandler");

        if(request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 support handled the request");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
