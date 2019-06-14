package clinica;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class CuentaCobro {
    int Numero;
    String fecha;
    Double valorcuenta;
    Boolean estado;
    Cliente cli;
    Veterinario vet;
        CuentaCobro(){
            Numero=1;
            fecha="14/06/19";
            valorcuenta=150.000;
            cli=new Cliente();
            vet=new Veterinario();
            Numero++;
        }
        
        public void Generarcuenta(){
            JOptionPane.showMessageDialog(null,"Nombre: ","CUENTA COBRO",JOptionPane.INFORMATION_MESSAGE);
        }
    
}