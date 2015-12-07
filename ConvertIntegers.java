import java.util.Scanner;
public class ConvertIntegers
{  public static void main(String[] args)
   {  Scanner reader = new Scanner(System.in);
      while (reader.hasNextLine())
      {  String number = reader.nextLine();
         if (reader.hasNextLine())
         {
            int radice;
            try 
            {  radice = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e)
            {  System.err.println("Dati sbagliati");
               break;
            } 
            try
            {  Integer.parseInt(number, radice);
            } catch (NumberFormatException e)
            {  System.out.println(e);
            }
         }
         else
         {
            System.err.println("dati sbagliati");
            break;
         }
      }
   }
}
