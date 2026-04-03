package diawara.jour2;

import java.util.Scanner;

public class Main {
  
public static  void main(String[] args) {
    Scanner lire = new Scanner(System.in);
 
    System.out.print("Entrez la valeur de a : ");
    int value1 = lire.nextInt();
    System.out.print("Entrez la valeurs de b : ");
    int value2 = lire.nextInt();
    

    System.out.println("La somme de "+value1+" + "+value2 + " = " + (value1+value2));
    lire.close();
}
}
