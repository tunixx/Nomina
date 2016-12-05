/**
 * Alexander Tejada OZuna
 * Santo Domingo, Republica Dominica
 * 20/10/2014
 * PrintZone and Source.
 * CopyRight
 * Proyecto de Base de Dato para J.A. UASD.
 * and open the template in the editor.

package Formulario;
//import com.mysql.jdbc.Connection;
import Basedato.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionMySQL {
    
    
   String db = "empleado";
   String url = "jdbc:mysql://localhost/"+db;
   String user = "root";
   String pass = "ROOT";
    
   public ConexionMySQL(){
 
   }
     public Connection Conectar(){
       
       Connection link = null;
       try{
           Class.forName("org.gjt.mm.mysql.Driver");
           link = DriverManager.getConnection(this.url, this.user, this.pass);
            // System.out.println("Exito");
       }
     
       catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
       return link;
   }
}
 **/