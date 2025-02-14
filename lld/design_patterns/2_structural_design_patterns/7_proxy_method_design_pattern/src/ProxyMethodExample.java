import employee.dao.EmployeeDAO;
import employee.dao.EmployeeDAOImpl;
import employee.dao.EmployeeDAOProxy;

public class ProxyMethodExample {
    public static void main(String[] args) {
        System.out.println("[Main] Creating EmployeeDAO instance through proxy...");

        EmployeeDAO employeeDAO = new EmployeeDAOProxy(new EmployeeDAOImpl());

        try {
            System.out.println("[Main] Attempting to create an employee record...");
            employeeDAO.create();
        } catch (SecurityException e) {
            System.out.println("[Main] Exception: " + e.getMessage());
        }
    }
}