package momo.jour2.exercice;

import java.util.Scanner;

public class EXO3 {
    
    public static void main(String[] args){
       Scanner mot= new Scanner(System.in);

       int nmbre1;
       int nmbre2;

       System.out.print("donner le premier nombre : ");
       nmbre1 = mot.nextInt();

       System.out.print("donnez le deuxieme nombre : ");
       nmbre2 = mot.nextInt();

       System.out.println("Le quotion de "+nmbre1+" / "+nmbre2+" = "+(nmbre1/nmbre2));
       System.out.println("Le produit de "+nmbre1+" * "+nmbre2+" = "+(nmbre1*nmbre2));
       System.out.println("La defference de "+nmbre1+" - "+nmbre2+" = "+(nmbre1-nmbre2));



       mot.close();
    }
}
