package momo.jour2.exercice;

import java.util.Scanner;

public class EXO2 {
 
    

    public static void main(String[] args){
       Scanner mot= new Scanner(System.in);

       int nmbre1;
       int nmbre2;

       System.out.print("donner le premier nombre : ");
       nmbre1 = mot.nextInt();

       System.out.print("donnez le deuxieme nombre : ");
       nmbre2 = mot.nextInt();

       System.out.println("La somme de "+nmbre1+" + "+nmbre2+" = "+(nmbre1+nmbre2));

       mot.close();
    }
}
