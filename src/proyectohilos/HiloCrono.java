/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectohilos;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Chumy
 */
public class HiloCrono extends Thread{
             String textSeg="",textMin="",textHora="";
    boolean inciarHilo;
    JLabel lblhora; 
    JLabel lblMin; 
    JLabel lblSeg; 
    public HiloCrono(JLabel lblhora, JLabel lblMin, JLabel lblSeg){
        this.lblhora=lblhora;
        this.lblMin=lblMin;
        this.lblSeg=lblSeg;
    }
    public void run(){
            try {
                while(Crono.corriendo){
                Thread.sleep(1000);
                ejecutarCrono();
                
                }
            } catch (InterruptedException ex) {
                System.out.println("Error en el hilo: "+ex);
            }   
    }
    public void ejecutarCrono(){
                    Crono.seg++;
                    if(Crono.seg>59){
                        Crono.seg=0;
                        Crono.min++;
                        if(Crono.min>59){
                            Crono.min=0;
                            Crono.hora++;
                        }
                    }
          textSeg=""+Crono.seg;
          textMin=""+Crono.min;
          textHora=""+Crono.hora;
         if(Crono.seg<10){
             textSeg="0"+Crono.seg;
         }
         if(Crono.min<10){
             textMin="0"+Crono.min;
         }
         if(Crono.hora<10){
             textHora="0"+Crono.hora;
         }
         lblhora.setForeground(new Color((120+Crono.seg*2),15,15));
         lblhora.setText(textHora);
         lblMin.setForeground(new Color(15,15,(120+Crono.seg*2)));
         lblMin.setText(textMin);
         lblSeg.setForeground(new Color(15,(120+Crono.seg*2),15));
         lblSeg.setText(textSeg);
        System.out.println(textHora+":"+textMin+":"+textSeg);
    }
    
}
