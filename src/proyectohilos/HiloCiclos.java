
package proyectohilos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author misae
 */

public class HiloCiclos{
    String nombreHilo;
    int    numHilo;
    DefaultListModel modelo= new DefaultListModel();
    DefaultListModel modelo2= new DefaultListModel();
    public synchronized void CicloNumeros(int numHilo) throws InterruptedException {
        if(numHilo==1){
            for (int i = 0; i < 5; i++) {
            
            System.out.println("Hilo " + numHilo + ", Ciclo: " + i);
            
           modelo.addElement("Hilo " + numHilo + ", Ciclo: " + i);
            Ciclos.ListNum.setModel(modelo);
        }
        }else{
            for (int i = 0; i < 5; i++) {
            
                System.out.println("Hilo " + numHilo + ", Ciclo: " + i);
            
                modelo2.addElement("Hilo " + numHilo + ", Ciclo: " + i);
                Ciclos.ListNum.setModel(modelo2);
            }
        }
        
    }

    public synchronized void CicloLetras(int numHilo) throws InterruptedException {
        if(numHilo==2){
            for (int i = 65; i <=69; i++) {
            System.out.println("Hilo " + numHilo + ", Ciclo: " + (char) i);
            
            modelo.addElement("Hilo " + numHilo + ", Ciclo: " + (char) i);
            Ciclos.ListLetra.setModel(modelo);
        }
        }else{
            for (int i = 65; i <=69; i++) {
            System.out.println("Hilo " + numHilo + ", Ciclo: " + (char) i);
            
            modelo2.addElement("Hilo " + numHilo + ", Ciclo: " + (char) i);
            Ciclos.ListLetra.setModel(modelo2);
        }
        }
        
        
    }
    
}
