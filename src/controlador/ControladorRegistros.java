package controlador;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.RegistroStock;

public class ControladorRegistros {
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    
    public int maxIdReg(Conexion con){
        try {
            sentencia=con.getConeccion().prepareStatement("SELECT  NVL(max(rs_id),0) from av_registros_stock");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("NVL(max(rs_id),0)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean crearRegistro(Conexion con,RegistroStock reg,Date fecha){
        try {
            sentencia=con.getConeccion().prepareStatement("INSERT INTO av_registros_stock VALUES(?,?,?,?,?)");
            sentencia.setInt(1, reg.getRegID());
            sentencia.setInt(2, reg.getIdProveedor());
            sentencia.setDate(3, fecha);
            sentencia.setInt(4, reg.getIdProd());
            sentencia.setInt(5, reg.getCantidad());
            resultado=sentencia.executeQuery();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
