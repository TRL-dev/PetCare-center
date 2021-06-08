package model;

public class Corral extends Jaulas {
    private String plant;
    private int NoPlant;
    public Corral(int largo, int ancho, double weight, int status, int occupationDays, String plant, int NoPlant, int id){
        super( largo,  ancho,  weight,  status,  occupationDays, id);
        this.plant=plant;
        this.NoPlant=NoPlant;
    }

    public String getPlant(){
        return plant;
    }

    public int getNoPlant(){
        return NoPlant;
    }

    public void setPlant(String plant){
        this.plant=plant;
    }

    public void setNoPlant(int NoPlant){
        this.NoPlant=NoPlant;
    }
}
