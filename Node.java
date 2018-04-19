/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author danielhiggins
 */
public class Node {
    int index;
    private String firstName;
    private String lastName;
    //private String address;
    private String city;
    private String county;
    private String state;
    private int zipCode;
    private String phoneNumber;
    private String email;
    String webPage;
    Map m = new Map();
    

    public Node(String f, String l,  String ci, String co, String s, int z, String p, String e, String w) {
        firstName = f;
        lastName = l;
        
        city = ci;
        county = co;
        state = s;
        zipCode = z;
        phoneNumber = p;
        email = e;
        webPage = w;

    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    
    
    public String getCity(){
        return city;
    }
    
    public String getCounty(){
        return county;
    }
    
    public String getState(){
        return state;
    }
    public int getzipcode(){
        return zipCode;  
    }
    public String getPhone(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getWeb(){
        char r = webPage.charAt(1);
        String f = webPage.substring(1);
        return f;
    }
    public double getHash(String f){
        return f.hashCode();
    }
       
    int getIndex(String st) throws FileNotFoundException{
        int k = m.getv(st);
        return k;
    }
}
