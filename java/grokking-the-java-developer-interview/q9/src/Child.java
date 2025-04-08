class Parent1 {

    public void hello() {
        System.out.println("Hello from Parent1 class");
    }

}

class Parent2 {

    public void hello() {
        System.out.println("Hello from Parent2 class");
    }

}

// Below lines causes compile time error due to Diamond problem
/* public class Child extends Parent1, Parent2 {

} */