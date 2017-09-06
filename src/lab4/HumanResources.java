/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Doern
 */
public class HumanResources {
    private List<Employee> employees;
    
    public HumanResources() {
        employees = new ArrayList();
    }
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee newGuy = new Employee(firstName, lastName, ssn);
        employees.add(newGuy);
    }
    public void orientHire(Employee newHire){
        newHire.doFirstTimeOrientation("Test Cube");
    }
    
    
    public void fireEmployee(Employee newFire){
        employees.remove(newFire);
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}
