package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static String getDetails(Employee employee) {
        return "Employee: {First Name:" + employee.getFirstName() + ", Last Name:" + employee.getLastName();
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new EmployeeDBAdapter(new EmployeeDB(1, "Tony", "Stark", "tony@stark.com"));
        Employee e2 = new EmployeeLDAPAdapter(new EmployeeLDAP("2", "Wick", "John", "john@wick.com"));
        Employee e3 = new EmployeeCSVAdapter(new EmployeeCSV("3,Peter,Parker,peter@parker.com"));

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);


        for(Employee employee : employeeList) {
            System.out.println(getDetails(employee));
        }
    }
}
