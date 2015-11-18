import java.util.Scanner;
public class TwoComplementAdd{
   public static void main(String args[]){
      Scanner reader = new Scanner(System.in);
      System.out.println("Inserire il primo numero:");
      int primo = reader.nextInt();
      System.out.println("Inserire il secondo numero:");
      int secondo = reader.nextInt();
      String pri = Integer.toString(primo);
      String sec =Integer.toString(secondo);
      int lungh = pri.length();
      int k = 0;
      int i =0;
      int finale= 0;
      int riporto = 0;
      while (k < lungh){

        
         int a;
         int b;
         a = Integer.parseInt(pri.substring(k, k+1));
         b = Integer.parseInt(sec.substring(k, k+1));
         System.out.println("test:" + a);
         if(a+b==0) {
            finale = finale + (riporto*10^k);
            riporto = 0;
            i--;
            k++;}
         else if (a+b == 1)
            {if (riporto == 1)
               {i--;
                k++;
                }
             else if (riporto == 0){
                finale= finale + (10^k);
                i--;
                k++;}
             }
          else if (a+b==2)
          { finale = finale + (riporto *  10^k);
            riporto =1;
            k++;
            i--;}
        }
       if (riporto == 1){ finale = finale + riporto*10^(k+1);}
       System.out.println(finale);
       String s = Integer.toString(finale);
       if (s.length()> lungh){System.out.println("overflow");}
   }
}
  
