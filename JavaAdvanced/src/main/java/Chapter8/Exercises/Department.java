package Chapter8.Exercises;

public class Department {
    private String department;
    private int departmentId;
    private int totalNoOfEmployees;

    public Department(String department, int departmentId, int totalNoOfEmployees) throws DepartmentException {
        setDepartment(department);
        setDepartmentId(departmentId);
        setTotalNoOfEmployees(totalNoOfEmployees);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) throws DepartmentException {
        if (department == null || department.length() != 2) {
            throw new DepartmentException(department, this.departmentId, this.totalNoOfEmployees,
                    "Invalid department name: must be exactly two letters.");
        }
        this.department = department;
    }


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) throws DepartmentException {
        if (departmentId < 100 || departmentId > 499) {
            throw new DepartmentException(this.department, departmentId, this.totalNoOfEmployees,
                    "Invalid department ID: must be between 100 and 499.");
        }
        this.departmentId = departmentId;
    }


    public int getTotalNoOfEmployees() {
        return totalNoOfEmployees;
    }

    public void setTotalNoOfEmployees(int totalNoOfEmployees) throws DepartmentException {
        if (totalNoOfEmployees < 4 || totalNoOfEmployees > 10) {
            throw new DepartmentException(this.department, this.departmentId, totalNoOfEmployees,
                    "Invalid number of employees: must be between 4 and 10.");
        }
        this.totalNoOfEmployees = totalNoOfEmployees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department='" + getDepartment() + '\'' +
                ", departmentId=" + getDepartmentId() +
                ", totalNoOfEmployees=" + getTotalNoOfEmployees() +
                '}';
    }
}