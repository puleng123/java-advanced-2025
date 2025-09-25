package Chapter8.Exercises;

public class DepartmentException extends Exception {

    public DepartmentException(String department, int departmentId, int totalNoOfEmployees, String message) {
        super("Invalid department: " + department + ", ID: " + departmentId + ", Total No of Employees: " + totalNoOfEmployees + ", Message: " + message);
    }
}
