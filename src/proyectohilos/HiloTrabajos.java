/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectohilos;

import javax.swing.JOptionPane;

/**
 *
 * @author Chumy
 */
public class HiloTrabajos extends Thread{
        String NEmpleado;
        HTA trabajar;
        boolean asistencia;
        
    public HiloTrabajos(String nombre, HTA trabajar,boolean asistencia){
        this.NEmpleado=nombre;
        this.trabajar=trabajar;
        this.asistencia=asistencia;
    }
    public void estado(boolean asistencia){
        this.asistencia=asistencia;
    }
    public void run(){
        System.out.println("Llegó "+NEmpleado);
        
        while(true){
            try{
            
            //para saber cual hilo llegó con el booleano
            if(NEmpleado=="Jefe"){
                Thread.sleep(1500);
                trabajar.ponerTrabajar(this.NEmpleado,this.asistencia);
            }else{
                trabajar.trabajos(this.NEmpleado,this.asistencia);
            }
        }catch(InterruptedException ex){
            System.out.println("Error en el RUN (banderas): \n"+ex);
        }
        }
        
    }
}
