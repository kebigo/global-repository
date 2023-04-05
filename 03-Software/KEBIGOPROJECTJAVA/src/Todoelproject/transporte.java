package Todoelproject;

public class transporte {
    int idTransporte;
    double precio;
    String tipo;
    String destino;
    String origen;
    int puntuacion;
    String extras;

    public transporte() {
        this.idTransporte = 0;
        this.precio = 0;
        this.tipo = "";
        this.destino = "";
        this.origen = "";
        this.puntuacion = 0;
        this.extras = "";
    }

    public transporte(transporte t) {
        this.idTransporte = t.idTransporte;
        this.precio = t.precio;
        this.tipo = t.tipo;
        this.destino = t.destino;
        this.origen = t.origen;
        this.puntuacion = t.puntuacion;
        this.extras = t.extras;
    }

    public transporte(int i, double p, String t, String d, String o, int pu, String e) {
        this.idTransporte = i;
        this.precio = p;
        this.tipo = t;
        this.destino = d;
        this.origen = o;
        this.puntuacion = pu;
        this.extras = e;
    }

    public int getIdTransporte() {
        return this.idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
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

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getExtras() {
        return this.extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

}
