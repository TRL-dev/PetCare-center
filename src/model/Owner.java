package model;
public class Owner {
    
    private String name;
    private int id;
    private int phone;
    private String adress;

    public Owner(String name, int id, int phone, String adress){

        this.name=name;
        this.id=id;
        this.phone=phone;
        this.adress=adress;
    }

    public String getname(){
        return name;
    }

    public int getid(){
        return id;
    }

    public int getphone(){
        return phone;
    }

    public String getadress(){
        return adress;
    }

    public void setOwnerName(String name){
        this.name=name;
    }
}
