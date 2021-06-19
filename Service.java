public class Service implements IEmploye{
    // Attribut d'instance
    private int id;
    private String libelle;

    //Attribut statique
    private static int nbreService;

    // Attribut de navigation
    //(one)1---(to)---*(many):un service a plusieurs employés
    private Employe[] tabEmploye=new Employe[5];
    private int nbreEmploy;
    

    //Constructeur par défaut
    public Service(){
        nbreService++;
        /*on incrémente le nombre de personne pour qu'il
            soit compté automatiquement*/
        id=nbreService;
    }

    //Constructeur surchagé
    public Service(String libelle){
        nbreService++;
        id=nbreService;
        setLibelle(libelle);
    }

    //Getters
    public int getId(){
        return id;
    }
    public String getLibelle(){
        return libelle;
    }
    public static int getNbreService(){
        return nbreService;
    }
    public Employe[] getTabEmploye(){
        return tabEmploye;
    }

    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setLibelle(String libelle){
        this.libelle=libelle;
    }
    public static void setNbreService(int nbreService){
        Service.nbreService=nbreService;
    }
    // le setter d'une relation one to many permet d'ajouter un element dans le tableau
    public void setTabEmploye(Employe employe){
        tabEmploye[nbreEmploy]=employe;
        nbreEmploy++;
        //Affecter un employé à un service
        employe.setService(this);

    }

    //Methode Métiers
    @Override
    public String affiche(){
        return "Id: "+id+"\n Libelle: "+libelle;
    }
    public void compare(){

    }

}