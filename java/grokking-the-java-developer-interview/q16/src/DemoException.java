import java.io.FileReader;

public class DemoException {

    public static void main(String[] args) {
        try {
            /* The below commented lines throw compile time exception (Checked Exception)
                since FileNotFoundException is not handled in catch block */
            // FileReader f = new FileReader("C:\\temp\\dummy.txt");
        } finally {
            System.out.println("Inside finally block");
        }
    }

}