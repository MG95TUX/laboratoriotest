import java.util.Scanner;
public class PrintEasterDayForYear{
public static void main(String[] args){
System.out.println("dammi l'anno in 4 cifre ");
Scanner reader = new Scanner(System.in);
int y = reader.nextInt();
int a,b,c,d,e,f,g,h,i, j,k,l,m,n,o,p,q,r;
a= y%19;
b =y/100;
c = y%100;
d= b/4;
e = b%4;
g= (8*b+13)/25;
h =(19*a+b-d-g+15)%30;
j= c/4;
k = c%4;
m= (a+ 11*h)/319;
r = (2*e+2*j-k-h+m+32)%7;
n = (h-m+r+90)/25;
p = (h-m+r+n+19)%32;
System.out.println("giorno "+p+ "mese " +n + "anno " +y );}
}
