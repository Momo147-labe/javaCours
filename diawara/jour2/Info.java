package diawara.jour2;

import java.util.Scanner;

public class Info {
    public static void main(String[] args){
        String nomComplet;
        int age;
        String departement;
        int licence;
        String num;
        String adresse;
        String mail;
        boolean estMarie;

        Scanner lire = new Scanner(System.in);

        System.out.println("----------------------------------------Informations----------------------------------------");

        System.out.print("Entrez Votre Nom Complet : ");
        nomComplet=lire.nextLine();

        System.out.print("Entrez votre Département : ");
        departement=lire.nextLine();

        System.out.print("Entrez votre âge : ");
        age=lire.nextInt();

        System.out.print("Entrez votre Licence : ");
        licence=lire.nextInt();

        System.out.print("Entrez adresse : ");
        adresse=lire.nextLine();

        System.out.print("Entrez votre Numéro : ");
        num=lire.nextLine();

        System.out.print("Entrez votre Email : ");
        mail=lire.nextLine();

        System.out.print("Êtes vous Marié(e) ? ");
        estMarie=lire.nextBoolean();

        System.out.print("-------------------------------------------- Vos informations -------------------------------------------- ");

        System.out.println("Nom Complet : "+nomComplet);
        System.out.println("Age : "+age);
        System.out.println("Département : "+departement);
        System.out.println("Licence : "+licence);
        System.out.println("Numéro : "+num);
        System.out.println("Adresse : "+adresse);
        System.out.println("Email : "+mail);
        System.out.println("Êtes vous marié(e) : "+estMarie);


        System.out.println("-------------------------------------------------------------------------------------------------------");

        lire.close();






    }
}
