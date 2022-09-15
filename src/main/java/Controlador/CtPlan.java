/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Clases.*;
import Modelo.MdPlan;
/**
 *
 * @author Web Master
 */
public class CtPlan {
    
  MdPlan mdplan;
  
  public CtPlan(){
     this.mdplan = new MdPlan();
  };
  
  
    public boolean CrearPlan(Plan p){
        try{
         this.mdplan.crearPlan(p);
        }
        catch(Exception e){
        return false;
        }
        return true;
    };
    public boolean ConsultarPlan(String codigo){
    try{
        this.mdplan.ConsultarPlan(codigo);
     
    }catch(Exception e){
       return false;
    }
    return true;
    }
    public boolean EliminarPlan(String codigo){
        
        try{
            this.mdplan.EliminarPlan(codigo);
               
        }
        catch(Exception e){
        return false;
        }
        
      return true;
    };
    public boolean ActualizarPlan(String Codigo, String nombre, String precio){
    try{
            this.mdplan.ActualizarPlan(Codigo,nombre, precio);
        }
        catch(Exception e){
        return false;
        }
    return true;
    }
}
