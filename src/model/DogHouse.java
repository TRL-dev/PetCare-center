package model;

public class DogHouse extends Jaulas {
    private String toy;
    private int NoToy;
    public DogHouse(int largo, int ancho, double weight, int status, int occupationDays, String toy, int NoToy, int id){
        super( largo,  ancho,  weight,  status,  occupationDays, id);
        this.toy=toy;
        this.NoToy=NoToy;
    }
    public String getToy(){
        return toy;
    }

    public int getNoToy(){
        return NoToy;
    }   

    public void setToy(String toy){
        this.toy=toy;
    }

    public void setNoToy(int NoToy){
        this.NoToy=NoToy;
    }
}
