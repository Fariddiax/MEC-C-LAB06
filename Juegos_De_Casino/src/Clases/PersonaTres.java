
package Clases;

import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.ImageIcon;

public class PersonaTres extends Thread{
     private int tiempo;
     public PersonaTres(int milisegundos) {
        this.tiempo = milisegundos;
    }
     
      public void run() {
        while (true) {
            int numero = (int) (Math.random() * (8) + 1);
            String ruta = "src\\Imagenes\\" + numero + ".jpg";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Visualizaciones.FramePersonas.lblPersonaTres.setIcon(imageIcon);
            
            try{
                Thread.sleep(this.tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(PersonaUno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
    }
  
}
