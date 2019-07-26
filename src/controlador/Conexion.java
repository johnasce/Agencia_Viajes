/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String username;
    private String password;
    private String url;
    private Connection conexion=null;

    /*
        este metodo permite conectarse a la base de datos
    */
    public void conectar(){
        try{
            this.setConeccion(DriverManager.getConnection(this.getUrl(),this.getUsername(),this.getPassword()));
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    /*
        metodo para cerrar la coneccion a la base de datos
    */
    public void cerrarConexion(){
        try{
           if(this.getConeccion()!=null && !this.getConeccion().isClosed()){
               System.out.println("Se cerro secion correctamente");
               this.getConeccion().close();
           }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConeccion() {
        return conexion;
    }

    public void setConeccion(Connection conexion) throws SQLException {
        this.conexion = conexion;
        this.conexion.setAutoCommit(false);
    }
    
}
