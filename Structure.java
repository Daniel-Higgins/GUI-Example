/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author danielhiggins
 */
public class Structure {
    private LinkedList<Node>[] table;
    int count;
    
    
    public Structure() {
        //table= array of linkedlists
        table = new LinkedList[51];
        count = 0;
        
    }
    //adds nodes of people to table
    public void addItem(Node s) throws FileNotFoundException {
        String st = s.getState();
        int tableIndex = s.getIndex(st);
        
        if (table[tableIndex] != null) {
            table[tableIndex].add(s);

            count++;

        } else {
            table[tableIndex] = new LinkedList<>();
            table[tableIndex].add(s);
            count++;

        }

    }
    //retrieves the linked lists in the table
    public LinkedList<Node>[] getTable(){
        return table;
    }
    
    public void fill(){
          for (int i = 0; i < table.length; i++) {
            if(table[i] == null){
                table[i] = new LinkedList<>();
            }
        }
    }
    int getCount(){
        return count;
    }

    //gets all nodes
    ArrayList<Node> getAllN() {
        ArrayList<Node> beta = new ArrayList();
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                for (int k = 0; k < table[i].size(); k++) {
                    if (table[i].get(k) != null) {
                        beta.add(table[i].get(k));
                    }
                }
            }
        }
        return beta;
    }
}
