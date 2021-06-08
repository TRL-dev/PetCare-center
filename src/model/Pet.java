package model;

public class Pet{
    private String name;
    private String raze;
    private String especie;
    private int age;
    private String synthoms;
    private Priority priority;
    private Status status;
    private Owner ownerPet;

    public Pet(String name, String raze, String especie, int age, String synthoms, int priority, String ownerName, int ownerId, int phone, String adress){

        this.name=name;
        this.raze=raze;
        this.especie=especie;
        this.age=age;
        this.synthoms=synthoms;
        
        switch(priority){
            case 1:
                this.priority=Priority.RED;
            break;

            case 2:
                this.priority=Priority.ORANGE;
            break;

            case 3:
                this.priority=Priority.YELLOW;
            break;

            case 4:
                this.priority=Priority.GREEN;
            break;

            case 5:
                this.priority=Priority.BLUE;
            break;
        }

        status=Status.WAITING;

        ownerPet = new Owner(ownerName, ownerId, phone, adress);
    }

    public String getName(){
        return name;
    }

    public String getRaze(){
        return raze;
    }

    public String getEspecie(){
        return especie;
    }

    public int getAge(){
        return age;
    }

    public String setSynthoms(){
        return synthoms;
    }

    public Priority getPriority(){
        return priority;
    }

    public Status getStatus(){
        return status;
    }

    public Owner getOwner(){
        return ownerPet;
    }

    public void setStatus(int status){
        switch(status){
            case 1:
                this.status=Status.INSESSION;
            break;

            case 2:
                this.status=Status.TRANSLADO;
            break;

            case 3:
                this.status=Status.AUTHORIZEDEXIT;
            break;

            case 4:
                this.status=Status.NOATTENTIONEXIT;
            break;

            case 5:
                this.status=Status.HOSPEDADO;
            break;
        }

    }

}