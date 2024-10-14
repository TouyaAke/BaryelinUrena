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
public class Persona {
    private String nombre;
    private String direcion;
    private String telefono;
    private String sexo;
    
    public Persona(String nombre, String direcion, String telefono,  String sexo){
     this.nombre = nombre;
     this.direcion = direcion;
     this.telefono = telefono;
     this.sexo = sexo;
    }
    public String getnombre(){
    return nombre;
    }
    
    public String getdirecion(){
    return direcion;
    }
    
    public String gettelefono(){
    return telefono;
    }
    
    public String getsexo(){
    return sexo;
    }
}

