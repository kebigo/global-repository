package Todoelproject;

public class viajero extends persona {
    int vacunasCOVID;

    public viajero() {
        super();
        this.vacunasCOVID = 0;
    }

    public viajero(viajero v) {
        super(v);
        this.vacunasCOVID = v.vacunasCOVID;
    }

    public viajero(String d, String n, String a, String e, String t, int v) {
        super(d, n, a, e, t);
        this.vacunasCOVID = v;
    }

    public int getVacunasCOVID() {
        return this.vacunasCOVID;
    }

    public void setVacunasCOVID(int vacunasCOVID) {
        this.vacunasCOVID = vacunasCOVID;
    }

}
