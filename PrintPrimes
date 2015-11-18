import java.util.Scanner;
public class PrintPrimes
{  public static void main(String[] args)
   {  Scanner reader = new Scanner(System.in);
      System.out.println("dammi un numero");
      int number = reader.nextInt();
      int base[] = new int[number+1];
      int i= 0;
      while (i< number){
      base[i] = i;
      i++;
      }
      int k = 2;
      i = 2;
      while ( i < number){
           while (k< number){
           if (base[k]% base[i] == 0) {base[k] = i;}
           k++;
           }
      i++;}
      i = 2;
      k= 2;
      while ( k < number){
           System.out.println(base[k]);
           k++;
           }
}}
