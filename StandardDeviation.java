import java.util.Scanner;
import java.lang.Math;
public class StandardDeviation{
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      int n = 0;
      double B = 0;
      double A = 0;
      double valori = 0; 
      double D = 0;     
      System.out.println("dammi un numero");
         while(reader.hasNextDouble()){
         valori = reader.nextDouble();
         B += valori;
         A+= valori*valori;
         n++;
         };
   D = Math.sqrt((A - B*B/n)/(n-1));
   System.out.println("Deviazione = " + D);
   System.out.println("tomarevacca = " + 1);
   }
}  
