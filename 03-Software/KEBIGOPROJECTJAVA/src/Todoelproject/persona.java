package Todoelproject;

public abstract class persona {
    protected String DNI;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String telefono;

    public persona() {
        this.DNI = "";
        this.nombre = "";
        this.apellido = "";
        this.email = "";
        this.telefono = "";
    }

    public persona(persona p) {
        this.DNI = p.DNI;
        this.nombre = p.nombre;
        this.apellido = p.apellido;
        this.email = p.email;
        this.telefono = p.telefono;
    }

    public persona(String d, String n, String a, String e, String t) {
        this.DNI = d;
        this.nombre = n;
        this.apellido = a;
        this.email = e;
        this.telefono = t;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
