/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import GUIexample.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.ComboBoxModel;

/**
 *
 * @author danielhiggins
 */
public class GUI extends javax.swing.JFrame {

    ComboBoxModel<String> s;
    Map p;
    Structure array = new Structure();
    LinkedList<Node> l;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        p = new Map();
        this.startUp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stateDropMenu = new javax.swing.JComboBox<>();
        stateLabel = new javax.swing.JLabel();
        retrieve = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        peopleList = new javax.swing.JList<>();
        getData = new javax.swing.JButton();
        dataabselper = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        webs = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nameTag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stateDropMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateDropMenuActionPerformed(evt);
            }
        });
        stateDropMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                stateDropMenuPropertyChange(evt);
            }
        });

        stateLabel.setText("State");

        retrieve.setText("Retrieve People");
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });

        peopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "*select a state", "then click retrieve*" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(peopleList);

        getData.setText("Get Information");
        getData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataActionPerformed(evt);
            }
        });

        dataabselper.setText("Data about selected person:");

        city.setText("City:");

        state.setText("State:");

        webs.setText("Web:");

        email.setText("Email:");

        nameTag.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(stateDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                        .addComponent(retrieve)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city)
                            .addComponent(dataabselper)
                            .addComponent(state)
                            .addComponent(webs)
                            .addComponent(email))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameTag)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel)
                    .addComponent(retrieve))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(dataabselper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(city)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(state)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(webs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email)))
                .addGap(18, 18, 18)
                .addComponent(nameTag)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stateDropMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateDropMenuActionPerformed


    }//GEN-LAST:event_stateDropMenuActionPerformed

    private void stateDropMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_stateDropMenuPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_stateDropMenuPropertyChange

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
        String statee = (String) stateDropMenu.getSelectedItem();

        int index = p.getv(statee);

        l = array.getTable()[index];
        ArrayList<Node> j = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
            j.add(l.get(i));
        }

        //doesnt have to be like this-but whatever
        Vector itemsVector = new Vector(j);
        String[] z = new String[itemsVector.size()];

        for (int i = 0; i < itemsVector.size(); i++) {
            Node e = (Node) itemsVector.get(i);
            String name = e.getFirstName() + " " + e.getLastName();

            if (name != null) {
                for (int w = 0; w < z.length; w++) {
                    if (z[i] == null) {
                        z[i] = name;

                    }
                }
            }
        }

        for (int i = 0; i < itemsVector.size(); i++) {
            peopleList.setListData(z);
        }


    }//GEN-LAST:event_retrieveActionPerformed

    private void getDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataActionPerformed

        int index = peopleList.getSelectedIndex();

        if (index == -1) {
            nameTag.setText("Name: Please Selcet a Name");

        } else {
            String n = peopleList.getSelectedValue();
            System.out.println(n);
            for (Node w : l) {
                if ((w.getFirstName() + " " + w.getLastName()).trim().equalsIgnoreCase(n.trim())) {
                    city.setText("City: " + w.getCity());
                    email.setText("Email: " + w.getEmail());
                    state.setText("State: " + w.getState());
                    webs.setText("Website: " + w.getWeb());
                    nameTag.setText("Name: " + w.getFirstName() + " " + w.getLastName());
                }
            }

        }


    }//GEN-LAST:event_getDataActionPerformed

    void startUp() {
        try {

            File file = new File("us-5001.csv");
            Scanner kb = new Scanner(file);

            kb.useDelimiter(",");

            while (kb.hasNext()) {
                Node n = new Node(kb.next(), kb.next(), kb.next(), kb.next(), kb.next(), kb.nextInt(), kb.next(), kb.next(), kb.nextLine());
                array.addItem(n);
            }
            //fills any null locations just incase
            array.fill();
            //sort states in ABC order
            Set<String> k = p.getOb();
            LinkedList<String> ll = new LinkedList<>();
            for (String q : k) {
                ll.add(q);
            }
            Collections.sort(ll);
            //adds the states to the drop menu
            for (String s : ll) {
                stateDropMenu.addItem(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JLabel dataabselper;
    private javax.swing.JLabel email;
    private javax.swing.JButton getData;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameTag;
    private javax.swing.JList<String> peopleList;
    private javax.swing.JButton retrieve;
    private javax.swing.JLabel state;
    private javax.swing.JComboBox<String> stateDropMenu;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel webs;
    // End of variables declaration//GEN-END:variables
}