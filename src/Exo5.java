
import java.util.Scanner;

   public class Exo5 {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        boolean estEtudiant;

        System.out.print("Entrer votre nom?? ");
        name = scanner.nextLine();


        System.out.print("Quelle est votre age?? ");
        age = scanner.nextInt();

        System.out.print("Vous etes etudiant?? (true/false): ");
         estEtudiant = scanner.nextBoolean();


        if (name.isEmpty()){
            System.out.println(" Vous n'avez pas entrer votre nom 😢");
        }
        else {
            System.out.println("Salut " + name + "! 😂");
        }

        if(age >= 18){

            System.out.println("Vous etes un adult");
        }
        else if (age < 0){
            System.out.println("Vous etes un enfant");
        } else if (age == 0) {
            System.out.println("vous etes un bébé");

        }
        else {
            System.out.println("Vous etes Jeune");
        }


        if(estEtudiant){
            System.out.println("Vous etes enregistrer comme etudiant");
        }
        else {
            System.out.println("Vous etes deconnecter");
        }

        scanner.close();
    }


}
