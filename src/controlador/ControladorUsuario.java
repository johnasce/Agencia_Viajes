
package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

public class ControladorUsuario {
    
    private ResultSet resultado=null;
    private PreparedStatement sentencia=null;
    
    public char tipoUs(Conexion con,String nickName,String password){
        try{
            sentencia=con.getConeccion().prepareStatement("Select us_rol from AV_USUARIOS where us_nickname like ? and "+
                                                          " us_contrasena like ? ");
            sentencia.setString(1, nickName);
            sentencia.setString(2, password);
            resultado=sentencia.executeQuery();
            
            //System.out.println(resultado.getCharacterStream("us_rol")+);
            while(resultado.next()){
                return resultado.getString("us_rol").charAt(0);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return 'x';
    }
    
    public char estUs(Conexion con,String nickName,String password){
        try{
            sentencia=con.getConeccion().prepareStatement("Select us_estado from AV_USUARIOS where us_nickname like ? and "+
                                                          " us_contrasena like ? ");
            sentencia.setString(1, nickName);
            sentencia.setString(2, password);
            resultado=sentencia.executeQuery();
            
            //System.out.println(resultado.getCharacterStream("us_rol")+);
            while(resultado.next()){
                return resultado.getString("us_estado").charAt(0);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return 'x';
    }
    
    public Usuario buscarUsuarioNombre(Conexion con,String nickName){
        Usuario us=new Usuario();
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT us_id,us_cedula,us_nombre,us_apellido,us_calle_prin,us_calle_secu, "+
                                                          "us_telefono,us_nickname,us_contrasena,us_email,us_estado "+
                                                          "FROM av_usuarios where us_nickname like ?");
            sentencia.setString(1, nickName);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                us.setUsuarioId(resultado.getInt("us_id"));
                us.setIdentificacion(resultado.getString("us_cedula"));
                us.setNombre(resultado.getString("us_nombre"));
                us.setApellido(resultado.getString("us_apellido"));
                us.setCallePrincipal(resultado.getString("us_calle_prin"));
                us.setCalleSecundaria(resultado.getString("us_calle_secu"));
                us.setTelefono(resultado.getString("us_telefono"));
                us.setNickName(resultado.getString("us_nickname"));
                us.setPassword(resultado.getString("us_contrasena"));
                us.setEmial(resultado.getString("us_email"));
                us.setEstado(resultado.getString("us_estado").charAt(0));
            }
            return us;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return us;
    }
    public Usuario buscarUsuarioCedula(Conexion con,String ci){
        Usuario us=new Usuario();
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT us_id,us_cedula,us_nombre,us_apellido,us_calle_prin,us_calle_secu, "+
                                                          "us_telefono,us_nickname,us_contrasena,us_email,us_estado "+
                                                          "FROM av_usuarios where us_cedula like ? ");
            sentencia.setString(1, ci);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                us.setUsuarioId(resultado.getInt("us_id"));
                us.setIdentificacion(resultado.getString("us_cedula"));
                us.setNombre(resultado.getString("us_nombre"));
                us.setApellido(resultado.getString("us_apellido"));
                us.setCallePrincipal(resultado.getString("us_calle_prin"));
                us.setCalleSecundaria(resultado.getString("us_calle_secu"));
                us.setTelefono(resultado.getString("us_telefono"));
                us.setNickName(resultado.getString("us_nickname"));
                us.setPassword(resultado.getString("us_contrasena"));
                us.setEmial(resultado.getString("us_email"));
                us.setEstado(resultado.getString("us_estado").charAt(0));
            }
            return us;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return us;
    }
    public boolean modificarUsuario(Conexion con,Usuario us){
        try{
            sentencia=con.getConeccion().prepareStatement("update av_usuarios set us_cedula=?,us_nombre=?,us_apellido=?,us_calle_prin=?,us_calle_secu=?, "+
                                                          "us_telefono=?,us_nickname=?,us_contrasena=?,us_email=? where us_id=?");
            sentencia.setString(1, us.getIdentificacion());
            sentencia.setString(2, us.getNombre());
            sentencia.setString(3, us.getApellido());
            sentencia.setString(4, us.getCallePrincipal());
            sentencia.setString(5, us.getCalleSecundaria());
            sentencia.setString(6, us.getTelefono());
            sentencia.setString(7, us.getNickName());
            sentencia.setString(8, us.getPassword());
            sentencia.setString(9, us.getEmial());
            sentencia.setInt(10, us.getUsuarioId());
            resultado=sentencia.executeQuery();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public int buscarId(Conexion con,String cedula){
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT us_id from av_usuarios where us_cedula=?");
            sentencia.setString(1, cedula);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                return resultado.getInt("us_id");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    
    public char estadoAct(Conexion con,int id) throws IOException{
        try{
            sentencia=con.getConeccion().prepareStatement("select US_ESTADO from av_usuarios where US_ID=?");
            sentencia.setInt(1, id);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                Reader est=resultado.getCharacterStream("US_ESTADO");
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
            sentencia=con.getConeccion().prepareStatement("update av_usuarios set US_ESTADO=? where US_ID=?");            
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
    
    public int verificarSiEstaEnFactura(Conexion con,int id){
        try{
            sentencia=con.getConeccion().prepareStatement("SELECT u.us_id,count(fc_id) " +
                                                        "from AV_USUARIOS u,AV_FACS_CABECERA fc " +
                                                        "where fc.AV_USUARIOS_US_ID(+)=u.US_ID and u.us_id=? " +
                                                        "group by u.us_id");
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
    
    public boolean eliminarUsuario(Conexion con,int id){
        try{
            sentencia=con.getConeccion().prepareStatement("DELETE FROM AV_USUARIOS where us_id= ? ");
            sentencia.setInt(1, id);
            sentencia.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
}
