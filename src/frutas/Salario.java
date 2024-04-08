/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;
import javax.swing.JOptionPane;
/**
 *
 * @author Yeifran Gallardo
 */
public class Salario {

    // Atributos
    private String cedula;
    private String nombre;
    private double salarioBasico=1300000;
    private int diasLaborados;
    private double ventasMes;
    private double prestamos;
    private double sueldoBase=0;
    private double auxTrans=0;
    private double auxTrans1;
    private double comisionMes=0;
    private double salarioNeto;
    
    public Salario(String cedula, String nombre, double salarioBasico, int diasLaborados, double ventasMes, double prestamos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salarioBasico = 1300000;
        this.diasLaborados = diasLaborados;
        this.ventasMes = ventasMes;
        this.prestamos = prestamos;
    }
    
        public double sueldoBase() {
       sueldoBase = salarioBasico * diasLaborados / 30;
       return sueldoBase;
    }
// if(numKilo>0 && numKilo<=2)
        public double auxTrans(double salarioBasico) {
        if (salarioBasico > 0 && salarioBasico <= 2600000) {

            auxTrans = 162000 * diasLaborados / 30;
            return auxTrans;

        } else if (salarioBasico > 2600000) return auxTrans = 0;
        return auxTrans;

    }
                 
          
        
         public double comisionMes() {
             comisionMes = 0.02 * ventasMes;
        return comisionMes ;
    }
            public double salarioNeto() {
                 double sueldoBase = sueldoBase();
                    double comisionMes = comisionMes();
                salarioNeto=sueldoBase+comisionMes-prestamos+auxTrans;
        
        return salarioNeto;
    }
         
                public void mostrarInformacion() {
        String mensaje = "Cedula empleado: " + cedula +
                "\nNombre Empleado: " + nombre +
                "\nSalario Básico: " + salarioBasico +
                "\nAuxilio de Transporte: " + auxTrans +
                "\nComisión de Ventas: " + comisionMes() +
                "\nPréstamos: " + prestamos +
                "\nSalario Neto a Recibir: " + salarioNeto();
        JOptionPane.showMessageDialog(null, mensaje, "datos del Vendedor", JOptionPane.INFORMATION_MESSAGE);
    }
         
                 public static void main(String[] args) {
        
        String cedula = JOptionPane.showInputDialog(" numero cédula del empleado:");
        String nombre = JOptionPane.showInputDialog("nombre del empleado:");
        double sueldoBase = 1300000; 
        int diasTrabajados = Integer.parseInt(JOptionPane.showInputDialog("días laborados:"));
        double ventasMes = Double.parseDouble(JOptionPane.showInputDialog(" valor total de las ventas del mes:"));
        double prestamos = Double.parseDouble(JOptionPane.showInputDialog(" descuentos por préstamos:"));

     
        Salario vendedor = new Salario(cedula, nombre, sueldoBase, diasTrabajados, ventasMes, prestamos);
                         
        vendedor.mostrarInformacion();
    }
}