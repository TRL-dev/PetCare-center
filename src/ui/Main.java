package ui;

import java.util.Scanner;

import model.Petcare;


public class Main {
    
    public static final Scanner lector = new Scanner(System.in);
    public static final Petcare petcare= new Petcare("petcare");

    public static void main(String[] args){

        int i=0;
        

        while(i==0){

            int opcion=menuPrincipal();

            switch(opcion){

                case 1:
                    int option=menu();

                    switch(option){
                        case 1:
                            createVet();
                        break;

                        case 2:
                            createPet();
                        break;

                        case 3:
                            createConsulta();
                        break;

                        case 4:
                            endConsulta();
                        break;

                        case 5:
                            waitingList();
                        break;

                        case 6:
                            deletePet();
                        break;

                        case 7:
                            deleteVet();
                        break;

                        case 8:
                            closeShop();
                            i=1;
                        break;

                        case 9:
                         i=1;
                        break;
                    }
                break;
                
                case 2:
                    int o=menu2();
                        switch(o){
                            case 1:
                                addPet();
                            break;

                            case 2:
                                lookCage();
                            break;

                            case 3:
                            break;

                            case 4:
                                petCageInfo();
                            break;

                            case 5:
                                getCage();
                            break;
                            
                        }
                break;
            }
        }
    }

    public static int menuPrincipal(){
        
        int opcion=0;
        int i = 0;

        System.out.println("A que servicio quiere acceder?\n");

        System.out.println("1- atencion veterinaria");
        System.out.println("2- guarderia de mascotas");

        while(i==0){
            opcion = lector.nextInt();
            lector.nextLine();

            if(opcion>2){
                System.out.println("la opcion ingresada no es valida intente nuevamente");
            }
            else{
                i=1;
            }
        }
        return opcion;
    }

    public static int menu(){

        int opcion=0;
        int i = 0;

        System.out.println("Que desea hacer? \n");

        System.out.println("1: agregar veterinario");
        System.out.println("2: agregar mascota");
        System.out.println("3: iniciar consulta");
        System.out.println("4: finalizar consulta");
        System.out.println("5: numero de mascotas en espera");
        System.out.println("6: eliminar mascota");
        System.out.println("7- eliminar veterinario");
        System.out.println("8- cerrar establecimiento");
        System.out.println("9- finalizar programa"); 

        while(i==0){
            opcion = lector.nextInt();
            lector.nextLine();

            if(opcion>9){
                System.out.println("la opcion ingresada no es valida intente nuevamente");
            }
            else{
                i=1;
            }
        }
        return opcion;
    }

    public static int menu2(){

        int opcion=0;
        int i = 0;

        System.out.println("Que desea hacer? \n");

        System.out.println("1: agregar Mascota a la guarderia");
        System.out.println("2: ver jaulas");
        System.out.println("3: ver estadisticas");
        System.out.println("4: ver datos de una mascota");
        System.out.println("5: ver jaula especifica"); 

        while(i==0){
            opcion = lector.nextInt();
            lector.nextLine();

            if(opcion>5){
                System.out.println("la opcion ingresada no es valida intente nuevamente");
            }
            else{
                i=1;
            }
        }
        return opcion;
    }

    public static void createVet(){
        String mensaje = "";
        String name = "";
        String lastName = "";
        int idVet = 0;
        String registro = "";

        System.out.println("ingrese el nombre del veterinario \n");
        name=lector.nextLine();

        System.out.println("ingrese el apellido del veterinario \n");
        lastName=lector.nextLine();

        System.out.println("ingrese la id del veterinario \n");
        idVet=lector.nextInt();
        lector.nextLine();

        System.out.println("ingrese el registro del veterinario \n");
        registro=lector.nextLine();

        mensaje= petcare.addVet(name, lastName, idVet, registro); 
        System.out.println(mensaje);

    }

    public static void createPet(){
        String message="";
        String name = "";
        String raze = "";
        String especie = "";
        int age = 0;
        String synthoms ="";
        int priority = 0;
        String ownerName="";
        int ownerId=0;
        int ownerPhone=0;
        String ownerAdress="";

        System.out.println("\ningrese el nombre de la mascota: ");
        name=lector.nextLine();

        System.out.println("\ningrese la especie de la mascota: ");
        especie=lector.nextLine();

        System.out.println("\ningrese la raza de la mascota: ");
        raze=lector.nextLine();

        System.out.println("\ningrese la edad de la mascota: ");
        age=lector.nextInt();
        lector.nextLine();

        System.out.println("\ningrese los sintomas de la mascota: ");
        synthoms=lector.nextLine();

        System.out.println("\ningrese su nombre: ");
        ownerName=lector.nextLine();

        System.out.println("\ningrese su id: ");
        ownerId=lector.nextInt();
        lector.nextLine();

        System.out.println("\ningrese su numero de telefono: ");
        ownerPhone=lector.nextInt();
        lector.nextLine();

        System.out.println("\ningrese su direccion: ");
        ownerAdress=lector.nextLine();

        System.out.println("\ningrese la prioridad de la mascota: ");

        System.out.println("1- prioridad ROJA");

        System.out.println("2- prioridad NARANJA");

        System.out.println("3- prioridad YELLOW");

        System.out.println("4- prioridad GREEN");

        System.out.println("5- prioridad BLUE");
        priority=lector.nextInt();
        lector.nextLine();

        message=petcare.addPet(name, raze, especie, age, synthoms, priority, ownerName, ownerId, ownerPhone, ownerAdress);
        System.out.println(message);
    }

    public static void createConsulta(){
        String message="";
        int idVet=0;

        System.out.println("ingrese el id del veterinario: ");
        idVet=lector.nextInt();
        lector.nextLine();

        message = petcare.iniciarConsulta(idVet);
        
        System.out.println(message);
    }

    public static void endConsulta(){
        String message="";
        int idVet=0;
        int option=0;

        System.out.println("ingrese el id del veterinario: ");
        idVet=lector.nextInt();
        lector.nextLine();

        System.out.println("que estado le asignara a la mascota: ");

        System.out.println("1- salida autolizada");
        System.out.println("2- Translado");
        option=lector.nextInt();
        lector.nextLine();

        message = petcare.finalizarConsulta(idVet, option);
        System.out.println(message);
    }

    public static void waitingList(){
        String message="";
        
        message = petcare.waitList();
        System.out.println(message);
    }

    public static void closeShop(){
        String message="";

        message = petcare.close();
        System.out.println(message);

        
    }

    public static void deletePet(){
        String message="";
        String name="";

        System.out.println("ingrese el nombre de la mascota a eliminar");
        name=lector.nextLine();

        message=petcare.deletePet(name);
        System.out.println(message);

    }

    public static void deleteVet(){
        String message="";
        int id=0;

        System.out.println("ingrese el id del veterinario a eliminar");
        id=lector.nextInt();
        lector.nextLine();

        message=petcare.deleteVet(id);
        System.out.println(message);
    }

    public static void addPet(){
        String message="";
        
        int largo=0;
        int ancho=0;
        double weight=0;
        int occupationDays=0;

        String name = "";
        String raze = "";
        String especie = "";
        int age = 0;
        String s="";
        int prio=0;
        String ownerName="";

        String toy="";
        int noToy=0;

        String plant="";
        int noPlant=0;

        boolean aquatic=true;
        int aquaOp=0;
        String material="";

        boolean colgando=true;

        int id=0;

        System.out.println("\ningrese el nombre de la mascota: ");
        name=lector.nextLine();

        System.out.println("\ningrese la especie de la mascota: ");
        especie=lector.nextLine();

        System.out.println("\ningrese la raza de la mascota: ");
        raze=lector.nextLine();

        System.out.println("\ningrese la edad de la mascota: ");
        age=lector.nextInt();
        lector.nextLine();

        System.out.println("\ningrese el largo requerido del habitad en metros");
        largo=lector.nextInt();
        lector.nextLine();

        System.out.println("\ningrese el ancho requerido del habitad en metros");
        ancho=lector.nextInt();
        lector.nextLine();

        System.out.println("\ningrese el peso maximo que soportara el habitad");
        weight=lector.nextDouble();
        lector.nextLine();

        System.out.println("\ningrese cuatos dias se quedara la mascota");
        occupationDays=lector.nextInt();
        lector.nextLine();

        System.out.println("\ningrese su nombre: ");
        ownerName=lector.nextLine();

        if(especie.equalsIgnoreCase("perro")){
            System.out.println("\ningrese el jueguete que tendra la mascota");
            toy=lector.nextLine();

            System.out.println("\ningrese el numero de juguetes");
            noToy=lector.nextInt();
            lector.nextLine();
        }
        else if(especie.equalsIgnoreCase("reptil")){
            boolean p=true;
            while(p){
                System.out.println("\nseleccione la opcion del habitad de la mascota: \n1-acuatica\n2-terrestre");
                aquaOp=lector.nextInt();
                lector.nextLine();

                if(aquaOp>0 && aquaOp<3){
                    switch(aquaOp){
                        case 1:
                            aquatic=true;
                        break;
                        
                        case 2:
                            aquatic=false;
                        break;
                    }
                    p=false;
                }
                
            }
        }
        else if(especie.equalsIgnoreCase("conejo")){
            System.out.println("\ningrese el tipo de planta que tendra la mascota");
            plant=lector.nextLine();

            System.out.println("\ningrese el numero de plantas");
            noPlant=lector.nextInt();
            lector.nextLine();
        }
        else if(especie.equalsIgnoreCase("pajaro")){
            boolean p=true;
            while(p){
                System.out.println("\nseleccione la opcion del jaula de la ave: \n1-colgante\n2-terrestre");
                aquaOp=lector.nextInt();
                lector.nextLine();

                if(aquaOp>0 && aquaOp<3){
                    switch(aquaOp){
                        case 1:
                            colgando=true;
                        break;
                        
                        case 2:
                            colgando=false;
                        break;
                    }
                    p=false;
                }
                
            }
        }
        message=petcare.petCage(largo, ancho, weight, occupationDays, name, raze, especie, age, s, prio, ownerName, toy, noToy, plant, noPlant, aquatic, material, colgando, id);
        System.out.println(message);
    }

    public static void petCageInfo(){
        String message="";

        String name="";

        System.out.println("ingrese el nombre de la mascota a buscar");
        name=lector.nextLine();
        message=petcare.petCageInfo(name);
        System.out.println(message);
    }

    public static void lookCage(){
        String message="";

        System.out.println("a continuacion se muestra la informacion de los habitads:\nE= ocupado enfermo, S=ocupado sano, V= vacío");

        message=petcare.lookCage();

        System.out.print(message);
    }

    public static void getCage(){
        String message="";
        int id=0;

        System.out.println("ingrese la id de la jaula que quiera ver");
        id=lector.nextInt();
        lector.nextLine();

        message=petcare.getCage(id);

        System.out.println(message);
    }
}
