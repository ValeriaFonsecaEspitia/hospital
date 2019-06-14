package Clinica;

import javax.swing.JOptionPane;

/** 
 *
 * @author estudiantes
 */
public class Mascota {
    int numeroid;
    String nombre;
    int edad;
    String direccion;
    String telefono;
    boolean genero;
    Mascota(String direccion,String telefono){
        this.direccion=direccion;
        this.telefono=telefono;
    }
    Mascota(){
        
        nombre= JOptionPane.showInputDialog(null,"Ingrese nombre de la mascota: ","Informacion",JOptionPane.QUESTION_MESSAGE);
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad de la mascota: ","Informacion",JOptionPane.QUESTION_MESSAGE));
        genero=Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Ingrese el genero de la mascota: ","Informacion",JOptionPane.QUESTION_MESSAGE));
    }
    
}