package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FacturaDetalle;
import modelo.Producto;

public class ControladorDetalle {
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    
    ArrayList<FacturaDetalle> listDetalles=new ArrayList<>();
    
    public ArrayList<FacturaDetalle> listDetalles(Conexion con,String idCabecera){
        try{
            int idCab=Integer.parseInt(idCabecera);
            sentencia=con.getConeccion().prepareStatement("Select AV_PRODUCTOS_PRO_ID,DF_PRECIO_UNI,df_cantidad,DF_PRECIO_SERV,df_subtotal "+
                                                          "from av_det_facs where AV_FACS_CABECERA_FC_ID = ? ");
            sentencia.setInt(1, idCab);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                FacturaDetalle fd=new FacturaDetalle();
                fd.setIdProducto(resultado.getInt("AV_PRODUCTOS_PRO_ID"));
                fd.setPrecioUni(resultado.getDouble("DF_PRECIO_UNI"));
                fd.setCantidad(resultado.getInt("df_cantidad"));
                fd.setPrecioServ(resultado.getDouble("DF_PRECIO_SERV"));
                fd.setSubtotal(resultado.getDouble("df_subtotal"));
                listDetalles.add(fd);
            }
            return listDetalles;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listDetalles;
    }
    
    public boolean guardarDetalleEnBD(Conexion con,int idPro,int cantidad,double precioServ,int idFac){
        boolean cent=true;
        try {
            sentencia=con.getConeccion().prepareStatement("Begin ingresar_detalle(?,?,?,?); end;");
            sentencia.setInt(1, idPro);
            sentencia.setInt(2, cantidad);
            if(precioServ==0){
                sentencia.setString(3, null);
            }
            else{
                sentencia.setDouble(3, precioServ);
            }
            sentencia.setInt(4, idFac);
            resultado=sentencia.executeQuery();
            
        } catch (SQLException e) {
            //cent=false;
            e.printStackTrace();
            return cent;
        }
        return cent;
    }
}