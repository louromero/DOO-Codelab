package module;

public class Reserva {
    private String nombre;
    private  int dni;
    private String contacto;
    private String fecha;
    private String hora;
    private String tipo;

    public Reserva(String nombre, int dni, String contacto, String fecha, String hora, String tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.contacto = contacto;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}



