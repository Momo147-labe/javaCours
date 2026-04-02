package momo.jour2;

import java.util.Scanner;

public class Lire {
    public static void main(String[] args){

        //La classe Scanner nous permet de recuperer les donner au clavier

        Scanner scanner=new Scanner(System.in);
        String prenom;
        String nom;
        int  age;
        System.out.print("Donnez votre prenom : ");
        prenom= scanner.nextLine();


        System.out.print("Donnez votre nom : ");
        nom = scanner.nextLine();


        System.out.print("Donnez vore age : ");
        age= scanner.nextInt();


        System.out.println("Bienvenu "+prenom +" "+nom+" vous avez "+age+" ans");

        // il faut fermer la lecture au clavier
        scanner.close();
    }
}
