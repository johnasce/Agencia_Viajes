package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Tipo;

public class ControladorTipos {
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    
    
    
    public ArrayList<String> getTipos(Conexion con){
        ArrayList<String> listTipos=new ArrayList<>();
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT tp_nombre FROM AV_TIPOS_PRODUCTO");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                listTipos.add(resultado.getString("tp_nombre"));
            }
            return listTipos;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listTipos;
    }
    
    public String buscarNombreTipos(Conexion con, String idTipo){
        String nombre="";
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT tp_nombre FROM AV_TIPOS_PRODUCTO where tp_id = ?");
            int idTip=Integer.parseInt(idTipo);
            sentencia.setInt(1, idTip);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                nombre=resultado.getString("tp_nombre");
            }
            return nombre;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return nombre;
    }
    
    public int buscarIdTipos(Conexion con,String nombre){
        int id=-1;
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT tp_id FROM AV_TIPOS_PRODUCTO where tp_nombre like ?");
            sentencia.setString(1, nombre);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                id=resultado.getInt("tp_id");
            }
            return id;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return id;
    }
    
    public int maxIdTip(Conexion con){
        try{
            sentencia=con.getConeccion().prepareStatement("Select nvl(max(tp_id),0) from av_tipos_producto");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("nvl(max(tp_id),0)");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean crearTipos(Conexion con,Tipo tp){
        try{
            sentencia=con.getConeccion().prepareStatement("INSERT INTO av_tipos_producto VALUES(?,?)");
            sentencia.setInt(1, tp.getTipoID());
            sentencia.setString(2, tp.getNombre());
            resultado=sentencia.executeQuery();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
