/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectohilos;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Chumy
 */
public class HiloIncendio implements Runnable{
    DefaultListModel avisoLista= new DefaultListModel();
    public Thread hilo;
    public boolean incendio;
    public boolean aviso= true;
    String icono;
    ImageIcon imagen;
    JLabel salida;
    public HiloIncendio(){
    
    }
    
    public void Alarma(boolean llamas){
        this.incendio=llamas;
    }
    
    
    public void run(){
        while(aviso){
        try{
            if(incendio){
                icono="D:\\Tecno\\4to semestre\\prog\\unidad 3\\proyecto\\ProyectoHilos\\src\\gifs\\hayfuego.gif";
                imagen= new ImageIcon(icono);
                Incendio.Fondo.setIcon(new ImageIcon(icono));
                avisoLista.addElement("Fuegooo!!");
                System.out.println("Hay fuego!!");
            }else{
                icono="D:\\Tecno\\4to semestre\\prog\\unidad 3\\proyecto\\ProyectoHilos\\src\\gifs\\normal.gif";
                imagen= new ImageIcon(icono);
                Incendio.Fondo.setIcon(new ImageIcon(icono));
                avisoLista.addElement("Un seguno mas sin llamas");
                System.out.println("Todo correcto");
            }
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            System.out.println("Error en lista: "+ex);
        }
        Incendio.txtAviso.setModel(avisoLista);
        }
    }
}
