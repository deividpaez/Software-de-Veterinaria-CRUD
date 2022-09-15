/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Web Master
 */
public class Dbdata {
    private String url = "jdbc:mysql://unitec.edu.co:3306/JavaAplicattion";
    private String user = "admin_Java";
    private String password = "&nS.F3=jE)Ow";
    private String DB = "JavaAplicattion";

    
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the DB
     */
    public String getDB() {
        return DB;
    }

    /**
     * @param DB the DB to set
     */
    public void setDB(String DB) {
        this.DB = DB;
    }
    
            
}
