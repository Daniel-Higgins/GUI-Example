/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author danielhiggins
 */
public class Map {
    //<State,Number>
    private HashMap<String, Integer> hp;
    
    public Map(){
        hp = new HashMap<>();
        this.add();
    }

    public void add() {
        try{
        
    
        File f = new File("states.txt");
        Scanner sc = new Scanner(f);
        
        while(sc.hasNext()){
            String k = sc.next();
            int i = sc.nextInt();
            
            hp.put(k, i);
        }
        
        }catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
    
    }
    public int getv(String s){
        return hp.get(s);
    }
    
    public Set<String> getOb(){  
        return hp.keySet();
    } 
    
    HashMap<String, Integer> getMap(){
        return hp;
    }
    
    
    
    
    
    
}
