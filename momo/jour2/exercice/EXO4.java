package momo.jour2.exercice;

import java.util.Scanner;

public class EXO4 {
    public static void main(String[] args){
       Scanner mot= new Scanner(System.in);

       int nmbre1;
       int nmbre2;
       int nmbre3;

       System.out.print("donner le premier nombre : ");
       nmbre1 = mot.nextInt();

       System.out.print("donnez le deuxieme nombre : ");
       nmbre2 = mot.nextInt();

       System.out.print("donnez le troisieme nombre : ");
       nmbre3 = mot.nextInt();

       System.out.println("La moyenne est de  "+((nmbre1+nmbre2+nmbre3)/3));

       mot.close();
    }
}
