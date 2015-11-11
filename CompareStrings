import java.util.Scanner;
public class CompareStrings{
    public static void main(String args[]){
         Scanner reader = new Scanner(System.in);
         System.out.println("dammi la prima frase");
         String s1 = reader.nextLine();
         System.out.println("dammi la seconda frase");
         String s2 = reader.nextLine();
         int i = 0;
         int l;
         int k = 0;
         boolean firstIsBeforeSecond;
         if (s1.length() - s2.length() <0)
               {l= s1.length();
                firstIsBeforeSecond = true;}
         else {l = s2.length();
               firstIsBeforeSecond = false;}
         while (i<l){
              if (s1.charAt(i)- s2.charAt(i) < 0) 
                    {firstIsBeforeSecond = true;
                     k = s1.charAt(i)- s2.charAt(i);
                     break;}
              else if (s1.charAt(i)- s2.charAt(i) > 0) 
                   {firstIsBeforeSecond = false;
                    k = s1.charAt(i)- s2.charAt(i);
                    break;}
         i++;}
         System.out.println(k);
}
}
