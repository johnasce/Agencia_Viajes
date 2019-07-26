package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import modelo.FacturaCabecera;

public class ControladorCabecera {
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    
    public FacturaCabecera buscarFacCab(Conexion con,String idCab){
        int idCabecera=Integer.parseInt(idCab);
        FacturaCabecera facCab=new FacturaCabecera();
        GregorianCalendar fecha=new GregorianCalendar();
        try{
            sentencia=con.getConeccion().prepareStatement("Select fc_fecha_emision,fc_subtotal,fc_iva,fc_total,AV_CLIENTES_CLI_ID "+
                                                           "from av_facs_cabecera where fc_id = ? ");
            sentencia.setInt(1, idCabecera);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                fecha.setTime(resultado.getDate("fc_fecha_emision"));
                facCab.setFaCabeceraFecha(fecha);
                facCab.setSubtotal(resultado.getDouble("fc_subtotal"));
                facCab.setIva(resultado.getDouble("fc_iva"));
                facCab.setTotal(resultado.getDouble("fc_total"));
                facCab.setIdCliente(resultado.getInt("AV_CLIENTES_CLI_ID"));
                return facCab;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return facCab;
    }
    
    public int idMaxCab(Conexion con){
        int id=0;
        try {
            sentencia=con.getConeccion().prepareStatement("Select max(fc_id) from av_facs_cabecera");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                id=resultado.getInt("max(fc_id)");
                return id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public boolean guardarCabeceraEnBD(Conexion con,int id,Date fecha,double subtotal,double iva,double total,String estado,
                                       int cliID, int usId){
        boolean cent=true;
        try {
            sentencia=con.getConeccion().prepareStatement("Insert into av_facs_cabecera values(?,?,?,?,?,?,?,?)");
            sentencia.setInt(1, id);
            sentencia.setDate(2, fecha);
            sentencia.setDouble(3, subtotal);
            sentencia.setDouble(4, iva);
            sentencia.setDouble(5, total);
            Reader read=new BufferedReader(new StringReader(estado));
            sentencia.setCharacterStream(6,read,estado.length());
            sentencia.setInt(7, cliID);
            sentencia.setInt(8, usId);
            resultado=sentencia.executeQuery();
        } catch (SQLException e) {
            cent=false;
            e.printStackTrace();
        }
        return cent;
    }
    
    public char estadoAct(Conexion con,int id) throws IOException{
        try{
            sentencia=con.getConeccion().prepareStatement("select FC_ESTADO from av_facs_cabecera where FC_ID=?");
            sentencia.setInt(1, id);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                Reader est=resultado.getCharacterStream("FC_ESTADO");
                int intValueOfChar;
                String estString = "";
                while ((intValueOfChar = est.read()) != -1) {
                    estString += (char) intValueOfChar;
                }
                return estString.charAt(0);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 'z';
    }
    
    public int cambiarEstado(Conexion con,int id,char estAct){
        try {
            sentencia=con.getConeccion().prepareStatement("update av_facs_cabecera set FC_ESTADO = ? where fc_id=?");
            if(estAct=='A'){
                String est='C'+"";
                Reader read=new BufferedReader(new StringReader(est));
                sentencia.setCharacterStream(1,read,est.length());
                sentencia.setInt(2,id);
                resultado=sentencia.executeQuery();
                return 1;
            }
            else if(estAct=='C'){
                return 2;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 3;
    }
    
}
