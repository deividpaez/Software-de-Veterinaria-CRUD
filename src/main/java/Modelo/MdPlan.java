/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Web Master
 */
public class MdPlan {
    Dbdata Dbdata;
    public MdPlan(){
      this.Dbdata = new Dbdata();
    }
    public boolean crearPlan(Plan p){
    /*AQUI HACE TODA LA CONEXXION Y ALMACENA LOS DATOS :) /*
        
        */
     
    try{
    Connection c = DriverManager.getConnection(Dbdata.getUrl(),Dbdata.getUser(),Dbdata.getPassword());
        System.out.println("OK");
          String query;
          query = "INSERT INTO plan1(codigo,nombre,precio) VALUES(?,?,?)";
        PreparedStatement ps = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
       ps = c.prepareStatement(query);
       ps.setString(1, p.getCodigo());
       ps.setString(2, p.getNombre());
       ps.setString(3, p.getPrecio());
      int rowsInserted = ps.executeUpdate();
      if(rowsInserted > 0){
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
             p.setCodigo("");
            return true;
           

      }else{
     
      }
      
         
    }
    catch(SQLException e){
        System.out.println("ERROR EN LA CONEXION A LA BASE DE DATOS " +  e.getMessage());
    }
        return true;
    
    }
    public boolean ConsultarPlan(String codigo){
          String query = "SELECT * FROM plan1 WHERE codigo = ?";
       
        try(Connection conn = DriverManager.getConnection(Dbdata.getUrl(),Dbdata.getUser(),Dbdata.getPassword()); 
        
             
                ){
              PreparedStatement stmt = conn.prepareStatement(query);
               stmt.setString(1, codigo);
               ResultSet rs = stmt.executeQuery();
         
        while(rs.next()){
            JOptionPane.showMessageDialog(null, "Su plan es: "+rs.getString("nombre"));
        }
          
       
      
       }catch(SQLException e){
            System.out.println("NO SE HIZO" +e);
        }
       
    return true;
    }
    public boolean EliminarPlan(String codigo){
          String query = "DELETE FROM plan1 WHERE codigo ="+codigo;
       
        try(Connection conn = DriverManager.getConnection(Dbdata.getUrl(),Dbdata.getUser(),Dbdata.getPassword()); 
        
             
                ){
              
              Statement stmt = conn.createStatement();
             boolean resultado = stmt.execute(query);
             
               System.out.println(resultado);
         if(resultado){
              JOptionPane.showMessageDialog(null,"Su plan ha sido eliminado");
       }else{
         JOptionPane.showMessageDialog(null,"No hay ningun Plan registrado en la base de datos :(");
         }
       
          
       
      
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se ha podido Eliminar su plan D:");
            System.out.println(e);
            return false;
        }
       
    return true;
    }
      public boolean ActualizarPlan(String codigo, String nombre, String precio){
          String query = "UPDATE plan1 SET nombre = ?, precio = ? WHERE codigo = ?";
       
        try(Connection conn = DriverManager.getConnection(Dbdata.getUrl(),Dbdata.getUser(),Dbdata.getPassword()); 
        
             
                ){
              PreparedStatement stmt = conn.prepareStatement(query);
               stmt.setString(1, nombre);
               stmt.setString(2, precio);
               stmt.setString(3, codigo);
               int retorno = stmt.executeUpdate();
         
       
         if(retorno > 0){
          JOptionPane.showMessageDialog(null, "Su Plan Ha sido Actualizado");
         }
      
       }catch(SQLException e){
            System.out.println("ERROR " + e);
        }
       
    return true;
    }
    
}
