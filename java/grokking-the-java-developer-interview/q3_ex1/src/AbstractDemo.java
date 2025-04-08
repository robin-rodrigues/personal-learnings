abstract class MyAbstractClass {

    public MyAbstractClass() {
        System.out.println("Inside MyAbstractClass constructor");
    }

}

public class AbstractDemo extends MyAbstractClass {

    public AbstractDemo() {
        System.out.println("Inside AbstractDemo constructor");
    }

    public static void main(String[] args) {
        AbstractDemo obj = new AbstractDemo();
    }

}