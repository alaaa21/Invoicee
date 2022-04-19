/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.controller;

import com.sig.model.jScrollPanel;
import com.sig.view.Jbutton;
import com.sig.view.JfileChooser;
import com.sig.view.frame1;
import com.sig.view.string;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author pc
 */

    public class action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
                                                 
 
      
        
       
       
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      Jbutton btn4 =new Jbutton ("Cancel");
       btn4.addActionLitener(this);
       
       this.pack();
       this.setVisible(false);
        
    }                                        

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        {
            JfileChooser f1=new JfileChooser();
            f1.showSaveDailog(this);
            File ff=f1.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(ff);
                string t =frame1.txtData.getText();
                
                fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(frame1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         jScrollPanel p = new jScrollPanel ();
    if(evt.getSource()== p) {
        JFileChooser f =new JFileChooser();
        f.showOpenDialog(null);
    }
    if(evt.getSource()== p) {
        JFileChooser f =new JFileChooser();
        f.showOpenDialog(null);
    }
    }                                     

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 Jbutton btn3 =new Jbutton ("Save");
       btn3.addActionLitener(this);
       
       this.pack();
       this.setVisible(true);        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 Jbutton btn1 =new Jbutton ("Delete");
       btn1.addActionLitener(this);
       
       this.pack();
       this.setVisible(true);        // TODO add your handling code here:
    } 
//To change body of generated methods, choose Tools | Templates.

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
}
