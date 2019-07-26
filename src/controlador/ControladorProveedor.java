package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Proveedor;

public class ControladorProveedor {
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    ArrayList<String> listProv=new ArrayList<>();
    public ArrayList<String> getNombreProveedores(Conexion con){
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT prov_nombre FROM AV_PROVEEDORES");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                listProv.add(resultado.getString("prov_nombre"));
            }
            return listProv;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listProv;
    }
    public int maxIdProv(Conexion con){
        try{
            sentencia=con.getConeccion().prepareStatement("Select max(prov_id) from av_proveedores");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("max(prov_id)");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    public int buscarIDProv(Conexion con, String nombre){
        try{
            sentencia=con.getConeccion().prepareStatement("Select prov_id from av_proveedores where prov_nombre=?");
            sentencia.setString(1, nombre);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("prov_id");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean registrarProveedor(Conexion con,Proveedor prov){
        try{
            sentencia=con.getConeccion().prepareStatement("insert into av_proveedores values(?,?,?)");
            sentencia.setInt(1, prov.getProvID());
            sentencia.setString(2, prov.getNombre());
            sentencia.setString(3, prov.getRuc());
            resultado=sentencia.executeQuery();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
