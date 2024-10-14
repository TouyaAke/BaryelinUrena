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
    class Cliente extends Persona {
    private String idCliente;

    public Cliente(String nombre, String direccion, String telefono, String sexo ,String idCliente) {
        super(nombre, direccion, telefono, sexo);
        this.idCliente = idCliente;
    }

    public void contactarRepresentante() {
        System.out.println("El cliente " + getnombre() + " está contactando a un representante.");
    }

    public void solicitarInformacion() {
        System.out.println("El cliente " + getnombre() + " ha solicitado información.");
    }
}


