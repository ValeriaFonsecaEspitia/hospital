package clinica;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class Cliente extends Persona{
    int edad;
    String direccion;
    String telefono;
    
    Mascota mas;
   
    Cliente(){
         edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad: ","Informacion",JOptionPane.QUESTION_MESSAGE));
         telefono=JOptionPane.showInputDialog(null,"Ingrese su telefono: ","Informacion",JOptionPane.QUESTION_MESSAGE);
         direccion= JOptionPane.showInputDialog(null,"Ingrese direccion: ","Informacion",JOptionPane.QUESTION_MESSAGE);
         mas=new Mascota();
          mas=new Mascota(direccion,telefono);
    }
}
