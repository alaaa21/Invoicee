/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author pc
 */


public class MyListener implements ActionListener {

    


MyListener(){
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
        Jbutton btn;
        Jbutton btn2;
        Jbutton btn3;
        Jbutton btn4;
        Jbutton btn5;
        Jbutton btn6;
        
   
    btn3 =new Jbutton ("new invoice");
    btn4 =new Jbutton ("Delete");
    btn5 =new Jbutton ("Save");
    btn6 =new Jbutton ("Cancel");
   
    btn3.addActionLitener(this);
    btn4.addActionLitener(this);
    btn5.addActionLitener(this);
    btn6.addActionLitener(this);
    
    
    this.add(btn3);
    this.pack();
    this.setVisible(true);
    this.add(btn4);
    this.pack();
    this.setVisible(false);
    this.add(btn5);
    this.pack();
    this.setVisible(true);
    this.add(btn6);
    this.pack();
    this.setVisible(false);
}
public void action (ActionEvent e){
       
       
        jScrollPane1 p = new jScrollPanel ();
    if(e.getSource()== p) {
        JFileChooser f =new JFileChooser();
        f.showOpenDialog(null);
    }
    if(e.getSource()== p) {
        JFileChooser f =new JFileChooser();
        f.showOpenDialog(null);
    }
    
}

    private void setLayout(FlowLayout flowLayout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(Jbutton btn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(boolean btn2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class string {

        public string() {
        }
    }

   
    
    
  
    
}
