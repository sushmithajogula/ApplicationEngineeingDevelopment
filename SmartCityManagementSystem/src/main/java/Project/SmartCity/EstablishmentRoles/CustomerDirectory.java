/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EstablishmentRoles;

import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public class CustomerDirectory {
    public ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
    
    public Customer getCustomer(String name){
        for(Customer c : customerList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }

    public Customer getCustomer(int id){
        for(Customer c : customerList){
            if(c.getId() == id)
                return c;
        }
        return null;
    }
    
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
        
    public Customer createCustomer(String name, String username){
        Customer customer = new Customer(name, username);
        customer.setName(name);
        customer.setUsername(username);
        customer.setId(customerList.size()+1);
        customerList.add(customer);
        return customer;
    }
}
