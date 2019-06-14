package Clinica;

/**
 *
 * @author estudiantes
 */
import javax.swing.JOptionPane;
public class Persona {
    protected String nombre;
    protected int numeroid;
    Persona(){
       
    }
   public void IngresarDatos(){
         nombre= JOptionPane.showInputDialog(null,"Ingrese su nombre: ","Informacion",JOptionPane.QUESTION_MESSAGE);
        numeroid=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su número de identificacion:  ","Informacion",JOptionPane.QUESTION_MESSAGE));
    }
   
   public String getnombre(){
       return nombre;
   }
   public  void setnombre(String nombre){
       this.nombre=nombre;
   }
}