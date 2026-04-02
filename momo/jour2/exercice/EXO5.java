package momo.jour2.exercice;

import java.util.Scanner;

public class EXO5 {
    
    public static void main(String[] args){
       Scanner mot= new Scanner(System.in);

       int nmbre1;
       int nmbre2;

       System.out.print("donner la longueur : ");
       nmbre1 = mot.nextInt();

       System.out.print("donnez la largeur : ");
       nmbre2 = mot.nextInt();

       System.out.println("Le perimetre est de  "+2*(nmbre1+nmbre2));
       System.out.println("L'Air est de  "+(nmbre1*nmbre2));


       mot.close();
    }
}
