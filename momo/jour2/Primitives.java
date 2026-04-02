package momo.jour2;

//Jour 2 : Variables et Types
//- int, double, boolean, String
//- final (constantes)
//- Différence Java vs JavaScript (typage fort)


public class Primitives {
    public static void main(String[] args){
      // les types primitive en java
      // les type primitive en java commence toujours par une lettre majuscule
      // on a : int, double, char, final, boolean, long
       
      //les entier avec int
      int nbre=20;
      System.out.println("le nombre est "+ nbre);
 
     // les entier long de nombre de 9 chiffres
     long lnbre=222212222;
     System.out.println("le nombre long "+lnbre);

      //les caracter avec char
      char car='f';
      System.out.println("le caractère tapé est "+ car);

      // les reel 'double'
      double rel=2.3;
      System.out.println("Le nombre réel est "+ rel);

      //le boolean
      boolean veri=true;
      System.out.println("le bool est vrai "+ veri);

      // une constante en java ave final
      final double cons=3.14;
      System.out.println("La constante est "+ cons);

    }
}
