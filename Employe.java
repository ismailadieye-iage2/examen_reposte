public class Employe implements IEmploye{
    // Attribut d'instance
    private int id;
    private String nom_complet;
    private String dateEmbauche;
    private final int FORMAT=4;

    //Attribut statique
    private static int nbreEmploy;

    //Propriétés de navigation
    //(many)1---(to)---*(one) Plusiuers comptes associés a un client
    private Service service;

    public Service getService(){
        return service;
    }
    public void setService(Service service){
        this.service=service;
    }

    //Constructeur par défaut
    public Employe(){
        nbreEmploy++;
        /*on incrémente le nombre de personne pour qu'il
            soit compté automatiquement*/
        id=nbreEmploy;
    }

    //Constructeur surchagé
    public Employe(String nom_complet, String dateEmbauche){
        nbreEmploy++;
        id=nbreEmploy;
        setNom_complet(nom_complet);
        setDateEmbauche(dateEmbauche);
    }

    //Getters
    public int getId(){
        return id;
    }
    public String getNom_complet(){
        return nom_complet;
    }
    public String getDateEmbauche(){
        return dateEmbauche;
    }
    public static int getNbreEmploye(){
        return nbreEmploy;
    }

    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setNom_complet(String nom_complet){
        this.nom_complet=nom_complet;
    }
    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche=dateEmbauche;
    }
    public static void setNbreEmploye(int nbreEmploy){
        Employe.nbreEmploy=nbreEmploy;
    }

    //Methode Métiers
    @Override
    public  String affiche(){
        return "Id: "+id+"\n Nom Complet: "+nom_complet+"\n Date d'embauche: "+dateEmbauche;
    }
    public void compare(){

    }

}