/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.views;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 * creando clase base de datos
*/
public class Conectadb {
    
    /**
     * nombre de la base de datos
    */
    public String db = "bdclientes.sqlite";
    
    /**
     * URL del driver
    */
    public String url = "jdbc:sqlite:"+db;
    
    /**
     * usuario de la bd
    */
    public String user = "root";
    
    
    /**
     * contraseña del usuario de la bd
    */
    public String pass = "123";

   /**
    * 
    * @return la coneccion a la base de datos
    */
    
   public Connection Conectar(){

       Connection link = null;

       try{

           Class.forName("org.sqlite.JDBC");

           link = DriverManager.getConnection(this.url, this.user, this.pass);

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }


       return link;

   }
}
