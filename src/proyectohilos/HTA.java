
package proyectohilos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class HTA {
    
    public HTA(){
        
    }
    String icono;
    ImageIcon imagen;

    public void trabajos(String nombre_hilo,boolean asistenciaJ) throws InterruptedException{
           if(asistenciaJ){
               Thread.sleep(500);
                    if(nombre_hilo.equals("Empleado1")){
                        icono="D:\\Tecno\\4to semestre\\prog\\unidad 3\\proyecto\\ProyectoHilos\\src\\gifs\\word.gif";
                        imagen= new ImageIcon(icono);
                        Trabajos.pantalla1.setIcon(new ImageIcon(icono));
                        System.out.println(nombre_hilo+" trabajando 1");
                    }else if(nombre_hilo.equals("Empleado2")){
                        icono="D:\\Tecno\\4to semestre\\prog\\unidad 3\\proyecto\\ProyectoHilos\\src\\gifs\\power.gif";
                        imagen= new ImageIcon(icono);
                        Trabajos.pantalla2.setIcon(new ImageIcon(icono));
                        System.out.println(nombre_hilo+" trabajando 2");
           }  
         }else{
               Thread.sleep(500);
                    if(nombre_hilo.equals("Empleado1")){
                        icono="D:\\Tecno\\4to semestre\\prog\\unidad 3\\proyecto\\ProyectoHilos\\src\\gifs\\baile.gif";
                        imagen= new ImageIcon(icono);
                        Trabajos.pantalla1.setIcon(new ImageIcon(icono));
                        System.out.println(nombre_hilo+" descansando 1");
                    }else if(nombre_hilo.equals("Empleado2")){
                        icono="D:\\Tecno\\4to semestre\\prog\\unidad 3\\proyecto\\ProyectoHilos\\src\\gifs\\platica.gif";
                        imagen= new ImageIcon(icono);
                        Trabajos.pantalla2.setIcon(new ImageIcon(icono));
                        System.out.println(nombre_hilo+" descansando 2");
                    }
           }
                    
                
            
        
    }
    
    //el notifyAll activa a todos los hilos que están esperando
    
    public synchronized void ponerTrabajar(String nombre_hilo,boolean asistencia) throws InterruptedException{
                
            if(asistencia){
                Thread.sleep(500);
                System.out.println("\n A trabajar: "+nombre_hilo+"  "+asistencia);
                
            }else{
                System.out.println("\n A descansar  "+asistencia);
            }



                

    }
    
    /*public void intertir(){
        if(this.trabajar){
            this.trabajar=false;
        }else{
            this.trabajar=true;
        }
        
    }
    */
}
