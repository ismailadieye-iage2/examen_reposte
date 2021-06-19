import java.util.Scanner;
public class Main{
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choix;
        UseCase uc=new UseCase();
        do {
            choix=menu();
            switch (choix) {
                case 1:
                System.out.println("Entrez le libelle");
                String libelle=scanner.nextLine();
                Service sr=new Service();
                sr.setLibelle(libelle);
                uc.ajoutService(sr);
                    break;

                case 2:
                uc.listerService();
                    break;

                case 3:  
                System.out.println("Entrez le nom complet");
                String nom_complet=scanner.nextLine();
                System.out.println("Entrez la date d'mebauche");
                String dateEmbauche=scanner.nextLine();
                Employe ep=new Employe();
                ep.setNom_complet(nom_complet);
                ep.setDateEmbauche(dateEmbauche);
                uc.ajoutEmploye(ep);     
                    break;

                case 4:
                    break;
                    
                case 5: 
                    break;

                case 6:
                    System.out.println("Au revoir");
                    break;
                   
                default:
                    System.out.println("Veuillez faire un choix");
                    break;
            }

        }
        while(choix!=6);
    }

        public static int menu(){
            System.out.println("1-Ajouter un service"
                                +"\n2-lister Service"
                                +"\n3-Ajouter un employé"
                                +"\n4-Affecter un service à un employé"
                                +"\n5-Afficher les employés d'un service"
                                +"\n6-Quitter"
                                +"\nMerci de faire votre choix: ");
            String choix;
            
            choix=scanner.nextLine();
            return Integer.parseInt(choix);
        }
        

    }