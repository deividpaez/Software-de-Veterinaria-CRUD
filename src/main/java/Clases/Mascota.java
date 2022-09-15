/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Deivid
 */
public class Mascota {
    private String  codigo;
    private String nombre;
    private int annioNac;
    private int peso;
    private String especie;
    private Plan p1;
    private Pago pg;
    
    public Mascota(String codigo, String nombre, int annioNac, int peso, String especie, Plan p1,Pago pg){
       this.codigo = codigo;
       this.nombre = nombre;
       this.annioNac = annioNac;
       this.peso = peso;
       this.especie = especie;
       this.p1 = p1;
       this.pg = pg;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the annioNac
     */
    public int getAnnioNac() {
        return annioNac;
    }

    /**
     * @param annioNac the annioNac to set
     */
    public void setAnnioNac(int annioNac) {
        this.annioNac = annioNac;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the p1
     */
    public Plan getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Plan p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public Pago getPg() {
        return pg;
    }

    /**
     * @param pg the pg to set
     */
    public void setPg(Pago pg) {
        this.pg = pg;
    }
            
            
}
