import singleton.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Singleton instance 1: " + s1);
        System.out.println("Singleton instance 2: " + s2);

        System.out.println(s1 == s2);
    }
}