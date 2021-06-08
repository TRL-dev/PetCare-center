package model;


public class Petcare {

    public static final int MAXPET= 120;
    public static final int MAXVET= 7;

    public static final int MAXHIGHT=6;
    public static final int MAXWIDE=5;
    
    private String name="";

    private Jaulas[][] habitad;
    private Pet[] pacientes;
    private Veterinary[] empleados;

    public Petcare(String name){

        this.name=name;

        pacientes= new Pet[MAXPET];
        empleados = new Veterinary[MAXVET];
        habitad = new Jaulas[MAXHIGHT][MAXWIDE];
        int id=0;
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                id++;
                habitad[i][j]=new Guacal(1,  1,  30,  0, 0, id);
            }
        }

        for(int i=3;i<MAXHIGHT;i++){
            for(int j=0; j<3;j++){
                id++;
                habitad[i][j]=new DogHouse(3,  6,  56.5, 0, 0, "", 0, id);
            }
        }

        for(int i=0; i<2;i++){
            for(int j=3; j<MAXWIDE; j++){
                id++;
                habitad[i][j]=new Aquary(10,  15,  130,  0, 0, true, "", id);
            }
        }

        for(int i=2;i<4;i++){
            for(int j=3;j<MAXWIDE;j++){
                id++;
                habitad[i][j]=new Corral(4,  4,  70.65, 0, 0, "", 0, id);
            }
        }

        for(int i=4; i<MAXHIGHT;i++){
            for(int j=3;j<MAXWIDE;j++){
                id++;
                habitad[i][j]=new BirdCage(1,  2,  20,  0, 0, true, id);
            }
        }
    }


    public Pet searchPet(String name){

        Pet encontrado=null;
        boolean continuar=true;
        
        for(int i=0; i<MAXPET && continuar; i++){
            if(pacientes[i]!=null && pacientes[i].getName().equalsIgnoreCase(name)){
                encontrado=pacientes[i];
                continuar=false;
            }
        }
        return encontrado;
    }

    public Veterinary searchVet(int idVet){

        Veterinary encontrado=null;
        boolean continuar=true;
        
        for(int i=0; i<MAXVET && continuar; i++){
            if(empleados[i]!=null && empleados[i].getidVet()==idVet){
                encontrado=empleados[i];
                continuar=false;
            }
        }
        return encontrado;
    }

    public String addVet(String name, String lastName, int idVet, String registro){
        String message= "";
        boolean continuar= true;
        Veterinary searchVet = searchVet(idVet);

        if(searchVet!=null){
            message="el veterinario ya ha sido agregado anteriormente";
        }
        else{
            for(int i=0; i<MAXVET && continuar; i++){
                if(empleados[i]== null){
                    empleados[i]= new Veterinary(name, lastName, idVet, registro);
                    continuar= false;
                    message= "el veterinario ha sido agregado exitosamente \n";
                }
            
            }
            if(continuar){
                message="no hay vacantes disponibles";
            }
        }
        return message;
    }

    public String addPet(String name, String raze, String especie, int age, String synthoms, int priority, String ownerName, int ownerId, int ownerPhone, String ownerAdress){
        String message= "";
        Pet searchPet= searchPet(name);

        if(searchPet!=null){
            message= "la mascota ya ha sido creado, por favor sea mas imaginativo";
        }
        else{
            boolean continuar = true;
            for(int i=0; i<MAXPET && continuar; i++){
                if(pacientes[i]==null){
                    pacientes[i]=new Pet(name, raze, especie, age, synthoms, priority, ownerName, ownerId, ownerPhone, ownerAdress);
                    continuar=false;
                    message= "el paciente ha sido registrado exitosamente \n";
                }
            }

            if(continuar){
                message= "no hay vacantes disponibles \n";
            }
        }

        return message;
    }

    public String iniciarConsulta(int idVet){
        Veterinary veterinario = searchVet(idVet);
        
        String message="";
        boolean continuar=true;
        if(veterinario != null){

            if(veterinario.getCita()==false){

                for(int i=0;i<MAXPET && continuar;i++){
                    Pet mascota= pacientes[i];

                    if(mascota!=null && mascota.getStatus()==Status.WAITING){

                        if(mascota.getPriority()==Priority.RED){

                            veterinario.setCita(true);
                            mascota.setStatus(1);
                            veterinario.setPet(mascota);
                            message="cita creada\nel veterinario " + veterinario.getname() + " con la id " + veterinario.getidVet() + " esta atendiendo a la mascota " + mascota.getName();
                            continuar=false;
                        } 
                        else if(mascota.getPriority()==Priority.ORANGE){

                            veterinario.setCita(true);
                            mascota.setStatus(1);
                            veterinario.setPet(mascota);
                            message="cita creada\nel veterinario " + veterinario.getname() + " con la id " + veterinario.getidVet() + " esta atendiendo a la mascota " + mascota.getName();
                            continuar=false;
                        } 
                        else if(mascota.getPriority()==Priority.YELLOW){

                            veterinario.setCita(true);
                            mascota.setStatus(1);
                            veterinario.setPet(mascota);
                            message="cita creada\nel veterinario " + veterinario.getname() + " con la id " + veterinario.getidVet() + " esta atendiendo a la mascota " + mascota.getName();
                            continuar=false;
                        } 
                        else if(mascota.getPriority()==Priority.GREEN){

                            veterinario.setCita(true);
                            mascota.setStatus(1);
                            veterinario.setPet(mascota);
                            message="cita creada\nel veterinario " + veterinario.getname() + " con la id " + veterinario.getidVet() + " esta atendiendo a la mascota " + mascota.getName();
                            continuar=false;
                        } 
                        else if(mascota.getPriority()==Priority.BLUE){

                            veterinario.setCita(true);
                            mascota.setStatus(1);
                            veterinario.setPet(mascota);
                            message="cita creada\nel veterinario " + veterinario.getname() + " con la id " + veterinario.getidVet() + " esta atendiendo a la mascota " + mascota.getName();
                            continuar=false;
                        } 
                    }
                }
            }
            else{
                message="el veterinario ya esta en cita";
            }
        }
        else{
            message="el veterinario ingresado no existe";
        }
        return message;
    }

    public String finalizarConsulta(int idVet, int option){
        Veterinary veterinario = searchVet(idVet);
        
        String message="";

        if(veterinario!=null){
            if(veterinario.getCita()==true){
                if(option<4){
                    switch(option){
                        case 1:
                            veterinario.getPet().setStatus(3);
                            message="la cita ha sido terminada correctamente";
                        break;

                        case 2:
                            veterinario.getPet().setStatus(2);
                            message="la mascota ha sido transladada a otro centro medico";
                        break;

                        case 3:
                            Jaulas freeCage= searchFreeCage(veterinario.getPet().getEspecie());
                            veterinario.getPet().setStatus(5);

                            if(freeCage!=null){
                                freeCage.setPet(veterinario.getPet());
                                freeCage.setStatusJaula(3);
                            }
                        break;
                    }
                    veterinario.setCita(false);
                    veterinario.setNoConsulta(veterinario.getNoConsulta()+1);
                    veterinario.setPet(null);
                }
                else{
                    message="opcion desconocida";
                }
            }
            else{
                message="el veterinario no esta en cita";
            }
        }
        return message;
    }

    public String waitList(){
        int numero=0;
        String message="";

        for(int i=0;i<MAXPET;i++){
            Pet mascota = pacientes[i];
            if(mascota!=null){
                if(mascota.getStatus()==Status.WAITING){
                    numero++;
                }
            }
        }
        message="hay " + numero + " mascotas en espera de atencion";

        return message;
    }

    public String close(){
        int numero=0;
        int numeroRed=0;
        int numeroOrange=0;
        int numeroYellow=0;
        int numeroGreen=0;
        int numeroBlue=0;
        String mensaje="";

        int maxVet=0;
        Veterinary maxuVetu=empleados[maxVet];

        for(int i=0;i<MAXVET;i++){
            int max=0;
            Veterinary vet=empleados[i];
            if(vet!=null){
                if(max<vet.getNoConsulta()){
                    max=vet.getNoConsulta();
                    maxVet=i;
                }
            }
        }

        for(int i=0;i<MAXPET;i++){
            Pet mascota = pacientes[i];
            if(mascota!=null){
                if(mascota.getStatus()==Status.WAITING){
                    numero++;
                    mascota.setStatus(4);
                }
                else if(mascota.getStatus()==Status.AUTHORIZEDEXIT ){
                    if(mascota.getPriority()==Priority.RED){
                        numeroRed++;
                    }
                    else if(mascota.getPriority()==Priority.ORANGE){
                        numeroOrange++;
                    }
                    else if(mascota.getPriority()==Priority.YELLOW){
                        numeroYellow++;
                    }
                    else if(mascota.getPriority()==Priority.GREEN){
                        numeroGreen++;
                    }
                    else if(mascota.getPriority()==Priority.BLUE){
                        numeroBlue++;
                    }
                }
                else if(mascota.getStatus()==Status.TRANSLADO ){
                    if(mascota.getPriority()==Priority.RED){
                        numeroRed++;
                    }
                    else if(mascota.getPriority()==Priority.ORANGE){
                        numeroOrange++;
                    }
                    else if(mascota.getPriority()==Priority.YELLOW){
                        numeroYellow++;
                    }
                    else if(mascota.getPriority()==Priority.GREEN){
                        numeroGreen++;
                    }
                    else if(mascota.getPriority()==Priority.BLUE){
                        numeroBlue++;
                    }
                }
            }
        }
        mensaje="la tienda ha sido cerrada con exito\nquedaron " + numero+" mascotas sin atender\n" + "el veterinario con mas consultas es:\n"+ maxuVetu.getDatosConsulta() + "\nla cantidad de mascotas atendidas segun la prioridad es: " + "\nrojo: " + numeroRed + "\nnaranja: " + numeroOrange + "\namarillo: " + numeroYellow + "\nverde: " + numeroGreen + "\nazul: " + numeroBlue;
        return mensaje;
    }

    public String deletePet(String name){
        String message="mascota no existe";
        Pet pet=searchPet(name);

        if(pet!=null){
            pet=null;
            message="la mascota se ha eliminado correctamente";
        }
        return message;
    }

    public String deleteVet(int idVet){
        String message="veterinario no existe";
        Veterinary vet= searchVet(idVet);

        if(vet!=null){
            vet=null;
            message="el veterinario se ha eliminado correctamente";
        }
        return message;
    }

    public Jaulas searchFreeCage(String especie){
        Jaulas encontrado=null;
        boolean continuar=true;
        
        for(int i=0; i<MAXHIGHT && continuar; i++){
            for(int j=0; j<MAXWIDE;j++){

                if(habitad[i][j].getStatusJaula()==StatusJaula.EMPTY){
                    if(especie.equalsIgnoreCase("gato") && habitad[i][j] instanceof Guacal){
                        encontrado=habitad[i][j];
                    }
                    else if(especie.equalsIgnoreCase("perro") && habitad[i][j] instanceof DogHouse){
                        encontrado=habitad[i][j];
                    }
                    else if(especie.equalsIgnoreCase("reptil") && habitad[i][j] instanceof Aquary){
                        encontrado=habitad[i][j];
                    }
                    else if(especie.equalsIgnoreCase("conejo") && habitad[i][j] instanceof Corral){
                        encontrado=habitad[i][j];
                    }
                    else if(especie.equalsIgnoreCase("pajaro") && habitad[i][j] instanceof Corral){
                        encontrado=habitad[i][j];
                    }
                    else if(especie.equalsIgnoreCase("pajaro") && habitad[i][j] instanceof BirdCage){
                        encontrado=habitad[i][j];
                    }
                    continuar=false;
                }
                
            }
        }

        return encontrado;
    }

    public String petCage(int largo,int ancho,double weight,int occupationDays,String name,String raze,String especie,int age,String s,int prio,String ownerName, String toy, int NoToy, String plant, int NoPlant, boolean aquatic, String material, boolean colgando, int id){
        String message="";
        Jaulas k=searchFreeCage(especie);

        message=addPet(name, raze, especie, age, "", 5, ownerName, 0, 0, "");

        Pet pet=searchPet(name);

        if(pet!=null && k!=null){
            k.setPet(pet);
            message="la mascota ya se encuentra en la guarderia";
            k.setStatusJaula(2);
            k.setEverything(largo, ancho, weight, 0, occupationDays);
        }
        else if(pet!=null && k==null){
            message="no hay habitads libres";
        }
 
        return message;
    }

} 
