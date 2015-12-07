import java.util.Scanner;
public class SortThreeStrings{
   public static void main(String[] args)  {
       Scanner reader = new Scanner(System.in);
       System.out.println("dammi tre stringhe");
       String[] a = new String[3];
       a[0] = reader.next();
       a[1] = reader.next();
       a[2] = reader.next();
       int x =0;
       String z ="";
       while (x<2){
           if (a[x].compareTo(a[x+1]) <0){
                z=a[x];
                a[x] = a[x+1];
                a[x+1] = z;
                x=0;
            }
           else x++;}
     
    System.out.println(a[0] + a[1] +a[2]);}
}
