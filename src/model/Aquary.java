package model;

public class Aquary extends Jaulas {
    private boolean aquatic;
    private String material;
    public Aquary(int largo, int ancho, double weight, int status, int occupationDays, boolean aquatic, String material, int id){
        super( largo,  ancho,  weight,  status,  occupationDays, id);
        this.aquatic=aquatic;
        this.material=material;
    }

    public boolean getAquatic(){
        return aquatic;
    }

    public String getMaterial(){
        return material;
    }

    public void setAquatic(boolean aquatic){
        this.aquatic=aquatic;
    }

    public void setMaterial(String material){
        this.material=material;
    }
}
