/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setId(employeeList.size()+1);
        employeeList.add(employee);
        return employee;
    }
}