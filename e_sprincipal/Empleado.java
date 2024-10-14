/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_sprincipal;

/**
 *
 * @author User
 */
class Empleado extends Persona{
    private String puesto;
    private int horasExtra;
    
    public Empleado(String nombre, String direccion, String telefono, String sexo,String puesto){
     super(nombre,direccion,telefono,sexo);
     this.puesto = puesto;
    }
    
    public void SolicitarPermiso(){
        System.out.println("El empleado " + getnombre() + " ha solicitado un permiso");
    }
    
     public void reporteHorasExtra(int horas) {
        this.horasExtra = horas;
        System.out.println("El empleado " + getnombre() + " ha registrado " + horas + " horas extra.");
    }
}

