package momo.jour2;

import java.util.Scanner;

public class Exercice {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Donnez un nombre : ");
        int nombre=scanner.nextInt();

        System.out.println("Le nombre tapé est "+nombre);

        scanner.close();

    }
}
