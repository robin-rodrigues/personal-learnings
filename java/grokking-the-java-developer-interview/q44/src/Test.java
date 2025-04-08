public class Test {
    public void print(int a, long b) {
        System.out.println("Method 1");
    }

    public void print(long a, int b) {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        // below commented line throws compile time error since reference to print is ambiguous
        // obj.print(5, 10);
    }
}