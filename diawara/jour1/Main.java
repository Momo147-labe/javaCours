package diawara.jour1;

import java.util.Scanner;

public class Main{

    
    
    public static void main(String[] args){
        Scanner lire = new Scanner(System.in);
        System.out.println("Bonjour jour1");
        
        String mess = lire.nextLine();
        System.out.println("Mon message : " + mess);

        lire.close();
        
     
    }
    
}