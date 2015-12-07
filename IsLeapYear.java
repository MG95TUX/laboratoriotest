import java.util.Scanner;
public class IsLeapYear{
    public static void main(String[] args)  
       {Scanner reader = new Scanner(System.in);
        System.out.println("dammi un anno");
        int x = reader.nextInt();
        if (x< 0) System.out.println("coglione");
        else {if (x%400 ==0) System.out.println("bisestile");
              else if ((x%4==0) && (x%100 !=0)) System.out.println("bisestile");
              else System.out.println("nobisestile");
              }
       }
}
