/*
 * Alexander Tejada OZuna
 * Santo Domingo, Republica Dominica
 * 20/10/2014
 * PrintZone and Source.
 * CopyRight
 * Proyecto de Base de Dato para J.A. UASD.
 * and open the template in the editor.
 */
package Basedato;
//import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionMySQL {
   
   String db = "Nomina";
   String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName="+db;
   String user = "sa";
   String pass = "";
   //Prueba
   
  /* String sql2 = "INSERT INTO Empleados(empleadoPrimerApellido,empleadoSegundoApellido,empleadoPrimerNombre,empleadoSegundoNombre,empleadoFechaNacimiento,empleadoTelefono,empleadoGenero,empleadoCargo)"
                 +"VALUES('Mariot','Jut','Maria','Rosi','12-03-1993','8095433434','M','Gerente')";
 */
   //String sql ="Select *from Empleados";
     
   public ConexionMySQL(){
    
   }
   
   public Connection Conectar(){
       Connection link = null;
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//Cargar Driver
           link = DriverManager.getConnection(this.url, this.user, this.pass);
           System.out.println("Exito");
           
           //Prueba
           
          /* Statement sentencia = link.createStatement();
         ResultSet recursos = sentencia.executeQuery(sql2);
          ResultSet recurso = sentencia.executeQuery(sql);
          
          while(recurso.next()){
         System.out.println(recurso.getInt("empleadoCodigo")+" "+recurso.getString("empleadoPrimerNombre")+"  " +recurso.getString("empleadoPrimerApellido"));// Para Probar 
        }*/
        }
       catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
          System.out.println("Error");
       }
       return link;
     }
   
   //Prueba
   
       /* public static void main (String args[]){
       ConexionMySQL nuevaConeccion = new ConexionMySQL();
       nuevaConeccion.Conectar();
   }
*/

}


