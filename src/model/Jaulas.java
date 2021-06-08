package model;

public class Jaulas {
    private int largo=0;
    private int ancho=0;
    private double weight=0;
    private int occupationDays=0;
    private StatusJaula status;
    private int id;

    private Pet pet;
        
    public Jaulas(int largo, int ancho, double weight, int status, int occupationDays, int id){
        this.largo=largo;
        this.ancho=ancho;
        this.weight=weight;
        this.occupationDays=occupationDays;
        this.status=StatusJaula.EMPTY;
        
    }

    public int getLargo(){
        return largo;
    }

    public int getAncho(){
        return ancho;
    }

    public double getWeight(){
        return weight;
    }

    public StatusJaula getStatusJaula(){
        return status;
    }

    public int occupationDays(){
        return occupationDays;
    }

    public void setStatusJaula(int status){

        switch(status){
            case 1:
                this.status=StatusJaula.EMPTY;
            break;

            case 2:
                this.status=StatusJaula.OCUPIED_HELTHY;
            break;

            case 3:
                this.status=StatusJaula.OCUPIED_SICK;
            break;

        }
    }

    public Pet getPet(){
        return pet;
    }

    public void setPet(Pet pet){
        this.pet=pet;
    }

    public int getId(){
        return id;
    }  
    
    public void setId(int id){
        this.id=id;
    }

    public void setEverything(int largo, int ancho, double weight, int status, int occupationDays){
        this.largo=largo;
        this.ancho=ancho;
        this.weight=weight;
        this.occupationDays=occupationDays;
    }
}
