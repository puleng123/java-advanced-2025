package Chapter8.Exercises;

import java.util.ArrayList;
import java.util.List;

public class ThrowDepartmentException {
    public static void main(String[] args) {
        Department[] departments = new Department[6];
        List<Department> successfulDepartments = new ArrayList<>();

        String[] deptNames = {"HR", "IT", "Finance", "PR", "AB", "X"};
        int[] deptIds = {101, 99, 300, 500, 200, 150};
        int[] employeeCounts = {5, 6, 3, 11, 7, 4};

        for (int i = 0; i < departments.length; i++) {
            try {
                departments[i] = new Department(deptNames[i], deptIds[i], employeeCounts[i]);
                successfulDepartments.add(departments[i]);
                System.out.println("Department created successfully: " + deptNames[i]);
            } catch (DepartmentException e) {
                System.out.println("Failed to create department: " + e.getMessage());
            }
        }

        // Successful Departments
        System.out.println("\nSuccessful Departments:");
        for (Department dept : successfulDepartments) {
            System.out.println("Department: " + dept.getDepartment() +
                    ", ID: " + dept.getDepartmentId() +
                    ", Employees: " + dept.getTotalNoOfEmployees());
        }
    }
}