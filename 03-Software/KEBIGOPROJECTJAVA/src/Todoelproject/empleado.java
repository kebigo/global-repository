package Todoelproject;

public class empleado extends persona {
    String departamento;
    String rol;

    public empleado() {
        super();
        this.departamento = "";
        this.rol = "";
    }

    public empleado(empleado e) {
        super(e);
        this.departamento = e.departamento;
        this.rol = e.rol;
    }

    public empleado(String d, String n, String a, String e, String t, String de, String r) {
        super(d, n, a, e, t);
        this.departamento = de;
        this.rol = "";
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
