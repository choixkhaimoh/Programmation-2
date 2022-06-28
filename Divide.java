import java.util.Scanner;

 public class Divide
{
public static int quotient( int numerateur, int denominateur )
 {
 return numerateur / denominateur; 

} // Fin methode quotient

 public static void main( String args[] )
 {
 Scanner scanner = new Scanner( System.in ); // scanner for input

 System.out.print( "Entrer un numerateur SVP: " );
 int numerateur = scanner.nextInt();
 System.out.print( "Entrer un denominateur SVP: " );
 int denominateur = scanner.nextInt();
 int resultat = quotient( numerateur, denominateur );
 System.out.printf(
 "\nResult: %d / %d = %d\n", numerateur, denominateur, resultat );
 } // fin main
 } // fin classe Divide
 
