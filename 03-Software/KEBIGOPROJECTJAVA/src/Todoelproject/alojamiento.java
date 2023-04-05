package Todoelproject;

public class alojamiento {
    int idAlojamiento;
    double precio;
    String tipo;
    String destino;
    int puntuacion;
    String extra;
    String instalaciones;

    public alojamiento() {
        this.idAlojamiento = 0;
        this.precio = 0;
        this.tipo = "";
        this.destino = "";
        this.puntuacion = 0;
        this.extra = "";
        this.instalaciones = "";
    }

    public alojamiento(alojamiento a) {
        this.idAlojamiento = a.idAlojamiento;
        this.precio = a.precio;
        this.tipo = a.tipo;
        this.destino = a.destino;
        this.puntuacion = a.puntuacion;
        this.extra = a.extra;
        this.instalaciones = a.instalaciones;
    }

    public alojamiento(int i, double p, String t, String d, int pu, String e, String in) {
        this.idAlojamiento = i;
        this.precio = p;
        this.tipo = t;
        this.destino = d;
        this.puntuacion = pu;
        this.extra = e;
        this.instalaciones = in;
    }

    public int getIdAlojamiento() {
        return this.idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getInstalaciones() {
        return this.instalaciones;
    }

    public void setInstalaciones(String instalaciones) {
        this.instalaciones = instalaciones;
    }
//ESTO ES UNA PRUEBA PARA EL GIT
}