package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import modelo.Cliente;
import modelo.Producto;

public class ControladorCliente {
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    public Cliente buscarDatosCli(Conexion con,String cedula) throws IOException{
        Cliente cli=new Cliente();
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT cli_id,cli_nombre,cli_apellido,cli_telefono,CLI_CALLE_PRIN,CLI_CALLE_SECU,CLI_EMAIL,CLI_ESTADO "+
                                                          "from av_clientes where CLI_IDENTIFICACION like ?");
            sentencia.setString(1, cedula);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                cli.setClienteId(resultado.getInt("cli_id"));
                cli.setNombre(resultado.getString("cli_nombre"));
                cli.setApellido(resultado.getString("cli_apellido"));
                cli.setTelefono(resultado.getString("cli_telefono"));
                cli.setCallePrincipal(resultado.getString("CLI_CALLE_PRIN"));
                cli.setCalleSecundaria(resultado.getString("CLI_CALLE_SECU"));
                cli.setEmial(resultado.getString("CLI_EMAIL"));
                Reader est=resultado.getCharacterStream("CLI_ESTADO");
                int intValueOfChar;
                String estString = "";
                while ((intValueOfChar = est.read()) != -1) {
                    estString += (char) intValueOfChar;
                }
                cli.setEstado(estString);
                return cli;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return cli;
    }
    public String buscarCedula(Conexion con, String idCli){
        int id=Integer.parseInt(idCli);
        String cedula="";
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT CLI_IDENTIFICACION "+
                                                          "from av_clientes where CLI_ID like ?");
            sentencia.setInt(1, id);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                cedula=resultado.getString("CLI_IDENTIFICACION");
                return cedula;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return cedula;
    }
    
    public boolean actualizarCliente(Conexion con,int id,String identificacion,String nombre,String apellido,String callePrin,String calleSecu,
                                     String telefono,String email,String estado){
        try {
            sentencia=con.getConeccion().prepareStatement("update av_clientes set CLI_IDENTIFICACION = ?, CLI_NOMBRE= ? ,CLI_APELLIDO=?, "+  
                                                          "CLI_CALLE_PRIN = ? ,CLI_CALLE_SECU = ?,CLI_TELEFONO = ?,CLI_EMAIL = ?,CLI_ESTADO = ? "+
                                                          " where CLI_ID = ?");
            sentencia.setString(1, identificacion);
            sentencia.setString(2, nombre);
            sentencia.setString(3, apellido);
            sentencia.setString(4, callePrin);
            sentencia.setString(5, calleSecu);
            sentencia.setString(6, telefono);
            sentencia.setString(7, email);
            Reader read=new BufferedReader(new StringReader(estado));
            sentencia.setCharacterStream(8,read,estado.length());
            sentencia.setInt(9, id);
            sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public int maxID(Conexion con){
        try{
            sentencia=con.getConeccion().prepareStatement("Select max(cli_id) from av_clientes");
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("max(cli_id)");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    public boolean crearCliente(Conexion con,int id,String identificacion,String nombre,String apellido,String callePrin,String calleSecu,
                                     String telefono,String email,String estado){
        try {
            sentencia=con.getConeccion().prepareStatement("INSERT INTO av_clientes VALUES(?,?,?,?,?,?,?,?,?)");
            sentencia.setInt(1, id);
            sentencia.setString(2, identificacion);
            sentencia.setString(3, nombre);
            sentencia.setString(4, apellido);
            sentencia.setString(5, callePrin);
            sentencia.setString(6, calleSecu);
            sentencia.setString(7, telefono);
            sentencia.setString(8, email);
            Reader read=new BufferedReader(new StringReader(estado));
            sentencia.setCharacterStream(9,read,estado.length());
            sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public int verificarSiEstaEnFactura(Conexion con,int id){
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT c.cli_id,count(fc_id) " +
                                                        "from AV_CLIENTES c,AV_FACS_CABECERA fc " +
                                                        "where fc.AV_CLIENTES_CLI_ID(+)=c.CLI_ID and c.cli_id=? " +
                                                        "group by c.cli_id");
            sentencia.setInt(1, id);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("count(fc_id)");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean eliminarCliente(Conexion con,int id){
        try{
            sentencia=con.getConeccion().prepareStatement("DELETE FROM AV_CLIENTES where cli_id= ? ");
            sentencia.setInt(1, id);
            sentencia.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public char estadoAct(Conexion con,int id) throws IOException{
        try{
            sentencia=con.getConeccion().prepareStatement("select CLI_ESTADO from av_clientes where CLI_ID=?");
            sentencia.setInt(1, id);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                Reader est=resultado.getCharacterStream("CLI_ESTADO");
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
    
    public boolean cambiarEstado(Conexion con,int id,char estAct){
        try{
            sentencia=con.getConeccion().prepareStatement("update av_clientes set CLI_ESTADO=? where CLI_ID=?");            
            if(estAct=='A'){
                String est='I'+"";
                Reader read=new BufferedReader(new StringReader(est));
                sentencia.setCharacterStream(1,read,est.length());
                sentencia.setInt(2,id);
                resultado=sentencia.executeQuery();
                return true;
            }
            else if(estAct=='I'){
                String est='A'+"";
                Reader read=new BufferedReader(new StringReader(est));
                sentencia.setCharacterStream(1,read,est.length());
                sentencia.setInt(2,id);
                resultado=sentencia.executeQuery();
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
}
