package model;

public class BirdCage extends Jaulas {
    private boolean colgado;

    public BirdCage(int largo, int ancho, double weight, int status, int occupationDays, boolean colgado, int id){
        super( largo,  ancho,  weight,  status,  occupationDays, id);
        this.colgado=colgado;
    }

    public boolean getColgado(){
        return colgado;
    }

    public void setColgado(boolean colgado){
        this.colgado=colgado;
    }
}
