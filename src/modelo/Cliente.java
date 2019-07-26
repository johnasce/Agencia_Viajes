
package modelo;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase Cliente Tiene una super clase que es Persona
 */

public class Cliente extends Persona{
    
    // Declaracion de atributos para la clase Cliente
    private int clienteId;
    private String estado;
    
    // Constructor de la Clase Cliente para inicializar sin ningun parametro
    public Cliente(){
    }
    
    // Sobre de constructor de la clase  Cliente que reciva parametros para los atributos de la clase
    public Cliente(int clienteId) {
        this.clienteId = clienteId;
    }
    
    // Constructor con los atributos de la superclase (Persona) mas atributos de la subclase (Cliente)

    public Cliente(int clienteId, String identificacion, String nombre, String apellido, String callePrincipal, String calleSecundaria, String telefono, String emial) {
        super(identificacion, nombre, apellido, callePrincipal, calleSecundaria, telefono, emial);
        this.clienteId = clienteId;
    }
    
    // Getter and Setters para modificacion de atributos de la clase Cliente

    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clienteId=" + clienteId + '}';
    }
    
    
}
