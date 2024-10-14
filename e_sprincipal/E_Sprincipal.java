/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_sprincipal;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class E_Sprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        Empleado empleado = new Empleado("Santelle cruz", "Calle 23", "829-991-5456", "programadora", "femenina");
        Cliente cliente = new Cliente("Baryelin ureña", "Reparto peralta", "829-785-1928", "0010","femenina");

        int opcion;
         {
            System.out.println("--- Menú ---");
            System.out.println("1. Solicitar permiso (Empleado)");
            System.out.println("2. Reportar horas extra (Empleado)");
            System.out.println("3. Contactar representante (Cliente)");
            System.out.println("4. Solicitar información (Cliente)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    empleado.SolicitarPermiso();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de horas extra: ");
                    int horas = lectura.nextInt();
                    empleado.reporteHorasExtra(horas);
                    break;
                case 3:
                    cliente.contactarRepresentante();
                    break;
                case 4:
                    cliente.solicitarInformacion();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        
         }
    }
  
}
        
    

