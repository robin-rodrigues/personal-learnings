import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoException {

    public static void main(String[] args) {
        /* The below commented lines throw compile time exception (Checked Exception)
            since the most generic ex */
        /* try {
            FileReader f = new FileReader("C:\\temp\\dummy.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
        } */
    }

}