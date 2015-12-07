public class PrintSixthFibonacciNumber{ 
    public static int fibonacci(int z){
    int numero=0;
    if (z==0) return numero;
    if ((z==1) || (z==2)) return 1;
    else {numero= fibonacci(z-1) + fibonacci(z-2);
          return numero;}
    }
               
       
    public static void main(String[] args){
    int x =7;
    int risultato = fibonacci(x);
    System.out.println(risultato);
    }
}
