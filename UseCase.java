public class UseCase{
private final int TAILLE=5;
    private int nbreServ;
    private Service[] tabService= new Service[TAILLE];
    private Employe[] tabEmploye= new Employe[TAILLE];
    private int nbreEmploy;
   
    //La methode Créer Service
    public void ajoutService(Service sr){
        if(nbreServ<TAILLE){
            tabService[nbreServ]=sr;
        nbreServ++;
        }else{
            System.out.println("Le tableau est rempli");
        }
    }

    public void listerService(){
        for(Service sr:tabService){
            if(sr!=null)
                System.out.println(sr.affiche());
        }
    }

    public void ajoutEmploye(Employe emp){
        if(nbreEmploy<TAILLE){
            tabEmploye[nbreEmploy]=ep;
        nbreEmploy++;
        }else{
            System.out.println("Le tableau est rempli");
        }
    }
}