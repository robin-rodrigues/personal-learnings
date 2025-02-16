public class Level2SupportHandler implements SupportHandler {
    SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println(request + " inside Level2SupportHandler");

        if(request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Level 2 support handled the request");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
