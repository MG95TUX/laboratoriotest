public class FactorGenerator{
private int num;
     public FactorGenerator(int a){
         if (a < 1) {throw new IllegalArgumentException();}
         else num = a;
         }
     public int nextFactor(){
     int j=2;
     while (true){
           if (num == 1){throw new IllegalStateException();};
           if (num %j == 0){
           num = num / j;
           return j;}
           else j++;}
           }
      public boolean hasMoreFactor(){
           if (num == 1){return false;}
           else return true;
           }
}
