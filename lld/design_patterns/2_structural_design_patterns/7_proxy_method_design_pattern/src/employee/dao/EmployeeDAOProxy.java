package employee.dao;

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;

    public EmployeeDAOProxy(EmployeeDAO employeeDAO) {
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create() {
        System.out.println("[Proxy] Checking user permissions before creating employee record...");
        String userRole = "ADMIN"; // This should come from a proper authentication system

        if ("ADMIN".equals(userRole)) {
            System.out.println("[Proxy] User is authorized. Proceeding with create operation.");
            employeeDAO.create();
        } else {
            System.out.println("[Proxy] User is not authorized to perform this action.");
            throw new SecurityException("Access Denied: You do not have permission to create employee records.");
        }
    }
}
