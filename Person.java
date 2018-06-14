/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author collincampbell
 */
public class Person {
    private String name;
    private String phone;
    private String address;
    private String email;
    private Map<String, Person> personByName;
    
    public Person(String name, String phone, String address, String email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        personByName = new HashMap<String, Person>();
        personByName.put(name, this);
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
