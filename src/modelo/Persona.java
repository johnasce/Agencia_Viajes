
package modelo;

/**
 *
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase Persona funciona como clase base 
 */
public class Persona {
    
    // Declaracion de lo atrbutos que son necesarios para la clase Persona
    private String identificacion;
    private String nombre;
    private String apellido;
    private String callePrincipal;
    private String calleSecundaria;
    private String telefono;
    private String emial;
    
    // Constructor vacio para hacer la instancia sin que pida ningun parametro
    public Persona(){
    }
    
    // Sobre del constructor para poder pasar atributos a la clase Persona
    public Persona(String identificacion, String nombre, String apellido, String callePrincipal, String calleSecundaria, String telefono, String emial) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.telefono = telefono;
        this.emial = emial;
    }
    
    // Setters and Getters para modificar valore de Personas
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", callePrincipal=" + callePrincipal + ", calleSecundaria=" + calleSecundaria + ", telefono=" + telefono + ", emial=" + emial + '}';
    }
    
     
}
