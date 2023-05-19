
package Clases;

import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.ImageIcon;


public class PersonaDos extends Thread{
     private int tiempo;
     public PersonaDos(int milisegundos) {
        this.tiempo = milisegundos;
    }
     
      public void run() {
        while (true) {
            int numero = (int) (Math.random() * (8) + 1);
            String ruta = "src\\Imagenes\\" + numero + ".jpg";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Visualizaciones.FramePersonas.lblPersonaDos.setIcon(imageIcon);
            
            try{
                Thread.sleep(this.tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(PersonaUno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
    }
  
}
