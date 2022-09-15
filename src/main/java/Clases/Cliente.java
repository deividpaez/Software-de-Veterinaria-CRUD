/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Deivid
 */
public class Cliente {
    private String idCliente;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private Mascota m;
    
    public Cliente(String IdCliente, String nombres,String apellidos, String direccion,String telefono){
       this.idCliente = IdCliente;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.direccion = direccion;
       this.telefono = telefono;
      
    }
    
    public String llamarMascota(){
      return idCliente;
    }
//METODOS GETTERS AND SETTERS
    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the m
     */
    public Mascota getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(Mascota m) {
        this.m = m;
    }
}
