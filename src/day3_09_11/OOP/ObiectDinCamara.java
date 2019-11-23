package day3_09_11.OOP;

public class ObiectDinCamara {
    protected String continut;

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public void afisare() {
        System.out.println("Obiect din camara + " + continut);
    }
}
