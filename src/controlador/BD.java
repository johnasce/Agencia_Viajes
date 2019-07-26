/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author i7 MAX GAMER
 */
public class BD {
    Conexion con=new Conexion();
        //SentenciasCrud s=new SentenciasCrud();
    public void conectar(){
        con.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        con.setUsername("CADMIN");
        con.setPassword("123321");
        con.conectar();

        if(con.getConeccion()!=null){
            System.out.println("base de datos conectada");
            /*s.consultarEmployees(con, 100);
            con.cerrarConexion();*/
            //s.InsertarPais(con, "Ec", "Ecuador", 2);
            //s.BorrarPaises(con,"Ec");
        }
    }

    public Conexion getCon() {
        return con;
    }
    
}
