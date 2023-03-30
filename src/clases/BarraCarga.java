/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import frames.frmPantallaCarga;
import frames.frmPrincipal;
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JProgressBar;

public class BarraCarga extends Thread {

    public static int barra = 0;
    javax.swing.JProgressBar proBar;
   
        public void run() {
            while (barra <= 100) {
            try {
                proBar.setBackground(Color.red);
                proBar.setValue(barra);
                barra++;
                sleep(10);
                if (proBar.getValue()==100) {
                    frmPrincipal obj1 = new frmPrincipal();
                    obj1.setVisible(true);
                    frmPantallaCarga obj2 = new frmPantallaCarga();
                    obj2.setVisible(false);
                }
            } catch (Exception e) {
            }
        }
        }
    

    public void setProBar(JProgressBar proBar) {
        this.proBar = proBar;
    }

    public  int getBarra() {
        return barra;
    }
    

}
