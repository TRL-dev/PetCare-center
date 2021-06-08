package model;
public class Veterinary{

    private String name;
    private String lastName;
    private int idVet;
    private String registro;
    private boolean cita;
    private Pet pet;
    private int numeroConsultas;

    public Veterinary(String name, String lastName, int idVet, String registro){

        this.name=name;
        this.lastName=lastName;
        this.idVet=idVet;
        this.registro=registro;
        cita=false;
        pet=null;
    }

    public String getname(){
        return name;
    }

    public String getlastName(){
        return lastName;
    }

    public int getidVet(){
        return idVet;
    }

    public String getregistro(){
        return registro;
    }

    public Boolean getCita(){
        return cita;
    }

    public void setCita(Boolean cita){
        this.cita=cita;
    }

    public void setPet(Pet mascota){
        pet= mascota;
    }

    public Pet getPet(){
        return pet;
    }

    public int getNoConsulta(){
        return numeroConsultas;
    }

    public void setNoConsulta(int consulta){
        this.numeroConsultas=consulta;
    }

    public String getDatosConsulta(){
        String message="el veterinario " + name + " ha atendido " + numeroConsultas + " mascotas";
        return message;
    }

}