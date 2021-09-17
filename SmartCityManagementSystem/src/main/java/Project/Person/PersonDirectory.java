/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Person;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public void removePerson(Person customer){
        personList.remove(customer);
    }
    
    public Person getPerson(String name){
        for(Person c : personList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Person createPerson(String name, String address, String email, String phone, String picPath){
        Person person = new Person();
        person.setName(name);
        person.setAddress(address);
        person.setEmail(email);
        person.setPhone(phone);
        person.setPicPath(picPath);
        person.setId(personList.size()+1);
        personList.add(person);
        return person;
    }  
}
