package controlador;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import modelo.*;

public class ControladorProductos {
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    
    ArrayList<Producto> listProds=new ArrayList<>();
    
    public ArrayList<Producto> recuperarProductos(Conexion con){
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT pro_id,pro_fecha,pro_precio, "+
                                                          "pro_nombre,pro_descripcion,pro_lug_destino, "+
                                                          "av_tipos_producto_tp_id,pro_lug_partida,pro_duracion, "+
                                                          "pro_cantidad,pro_tipo_servicio "+
                                                          "FROM av_productos ORDER BY 1");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                Producto pro=new Producto();
                pro.setProID(resultado.getInt("pro_id"));
                GregorianCalendar fecha=new GregorianCalendar();
                fecha.setTime(resultado.getDate("pro_fecha"));
                pro.setProFecha(fecha);
                pro.setPrecio(resultado.getDouble("pro_precio"));
                pro.setNombre(resultado.getString("pro_nombre"));
                pro.setDescripcion(resultado.getString("pro_descripcion"));
                pro.setLugDestino(resultado.getString("pro_lug_destino"));
                pro.setTipo(resultado.getInt("av_tipos_producto_tp_id"));
                pro.setLugPartida(resultado.getString("pro_lug_partida"));
                pro.setDuracion(resultado.getInt("pro_duracion"));
                pro.setCantidad(resultado.getInt("pro_cantidad"));
                pro.setTipoServ(resultado.getString("pro_tipo_servicio").charAt(0));
                listProds.add(pro);
            }
            return listProds;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listProds;
    }
    
    public Producto recuperarProductosMod(Conexion con,String idPro){
        int id=Integer.parseInt(idPro);
        Producto pro=new Producto();
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT pro_id,pro_fecha,pro_precio, "+
                                                          "pro_nombre,pro_descripcion,pro_lug_destino, "+
                                                          "av_tipos_producto_tp_id,pro_lug_partida,pro_duracion, "+
                                                          "pro_cantidad,pro_tipo_servicio "+
                                                          "FROM av_productos where pro_id = ? "+
                                                          "ORDER BY 1");
            sentencia.setInt(1, id);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                pro.setProID(resultado.getInt("pro_id"));
                GregorianCalendar fecha=new GregorianCalendar();
                fecha.setTime(resultado.getDate("pro_fecha"));
                pro.setProFecha(fecha);
                pro.setPrecio(resultado.getDouble("pro_precio"));
                pro.setNombre(resultado.getString("pro_nombre"));
                pro.setDescripcion(resultado.getString("pro_descripcion"));
                pro.setLugDestino(resultado.getString("pro_lug_destino"));
                pro.setTipo(resultado.getInt("av_tipos_producto_tp_id"));
                pro.setLugPartida(resultado.getString("pro_lug_partida"));
                pro.setDuracion(resultado.getInt("pro_duracion"));
                pro.setCantidad(resultado.getInt("pro_cantidad"));
                pro.setTipoServ(resultado.getString("pro_tipo_servicio").charAt(0));
            }
            return pro;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return pro;
    }
    
    public String buscarNombrePro(Conexion con,String idProo){
        String nombrePro="";
        try{
            int idPro=Integer.parseInt(idProo);
            sentencia=con.getConeccion().prepareStatement("SELECT pro_nombre "+
                                                          "FROM av_productos where pro_id= ?");
            sentencia.setInt(1, idPro);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                nombrePro=resultado.getString("pro_nombre");
                return nombrePro;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return nombrePro;
    }
    
    public int maxIdPro(Conexion con){
        try {
            sentencia=con.getConeccion().prepareStatement("Select max(pro_id) from av_productos");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("max(pro_id)");
            }
        } catch (Exception e) {
            
        }
        return -1;
    }
    
    public boolean crearProducto(Conexion con,Producto pro,Date fecha){
        try {
            sentencia=con.getConeccion().prepareStatement("INSERT INTO av_productos VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            sentencia.setInt(1, pro.getProID());
            sentencia.setDate(2, fecha);
            sentencia.setDouble(3, pro.getPrecio());
            sentencia.setString(4, pro.getNombre());
            sentencia.setString(5, pro.getDescripcion());
            sentencia.setString(6, pro.getLugDestino());
            sentencia.setInt(7, pro.getTipo());
            sentencia.setString(8, pro.getLugPartida());
            sentencia.setDouble(9, pro.getDuracion());
            sentencia.setInt(10, pro.getCantidad());
            String tipoServ=pro.getTipoServ()+"";
            Reader read=new BufferedReader(new StringReader(tipoServ));
            sentencia.setCharacterStream(11,read,tipoServ.length());
            resultado=sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean modificarProducto(Conexion con,Producto pro,Date fecha){
        try {
            sentencia=con.getConeccion().prepareStatement("update av_productos set pro_fecha=?,pro_precio=?, "+
                                                          "pro_nombre=?,pro_descripcion=?,pro_lug_destino=?, "+
                                                          "av_tipos_producto_tp_id=?,pro_lug_partida=?,pro_duracion=?, "+
                                                          "pro_cantidad=?,pro_tipo_servicio=? where pro_id=?");
            
            sentencia.setDate(1, fecha);
            sentencia.setDouble(2, pro.getPrecio());
            sentencia.setString(3, pro.getNombre());
            sentencia.setString(4, pro.getDescripcion());
            sentencia.setString(5, pro.getLugDestino());
            sentencia.setInt(6, pro.getTipo());
            sentencia.setString(7, pro.getLugPartida());
            sentencia.setDouble(8, pro.getDuracion());
            sentencia.setInt(9, pro.getCantidad());
            String tipoServ=pro.getTipoServ()+"";
            Reader read=new BufferedReader(new StringReader(tipoServ));
            sentencia.setCharacterStream(10,read,tipoServ.length());
            sentencia.setInt(11, pro.getProID());
            resultado=sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public int cantidadActual(Conexion con, int id){
        try{
            sentencia=con.getConeccion().prepareStatement("select PRO_CANTIDAD from av_productos where PRO_ID = ?");
            sentencia.setInt(1, id);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("PRO_CANTIDAD");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean actualizarStock(Conexion con, int cantidad, int id){
        try{
            sentencia=con.getConeccion().prepareStatement("update av_productos set PRO_CANTIDAD = ? where PRO_ID = ?");
            sentencia.setInt(1, cantidad);
            sentencia.setInt(2, id);
            resultado=sentencia.executeQuery();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
