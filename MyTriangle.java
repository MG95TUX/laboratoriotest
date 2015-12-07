public class MyTriangle
{private double[] k;
 private double a,b,c;
   /*
      Construttore della classe MyTriangle.

      Precondizione: i valori dei tre lati devono essere tali da consentire
      l'esistenza del triangolo.
   */
   public MyTriangle(double la, double lb, double lc)
   {k = new double[3];
    k[0]= la;
    k[1] = lb;
    k[2] = lc;
    int i =0;
    
       while (i<2){
             if (k[i]> k[i+1]){
                   double temp = k[i];
                   k[i]= k[i+1];
                   k[i+1]=temp;
                   i=0;}
              else i++;
        }
     a = k[0];
     b = k[1];
     c = k[2];
	//... completare

      // un'analisi attenta delle proprietà dei triangoli e una inizializzazione
      // appropriata delle variabili di esemplare può rendere molto semplice la
      // realizzazione degli altri metodi... ragionare!!!
   }

   /*
      restituisce informazioni sul triangolo. le informazioni sono relative
      ai lati:     equilatero,  isoscele,    scaleno.
      agli angoli: acutangolo,  rettangolo,  ottusangolo.
      Esempio: per il triangolo di lati 3, 4, 5 restituisce la stringa
      "scaleno rettangolo".
   */
   public String info()
   {String l="";
        if ((a==b)  &&( b==c)){l = "equilatero";}
        else if  ((a==b)  || ( b==c)){l = "isoscele";}
        else {l= "scaleno";}
    String ang="";
         if (a*a +b*b == c*c) {ang = " rettangolo";}
         else if (a*a +b*b > c*c) {ang = " acutangolo";}
         else if (a*a +b*b < c*c) {ang = " ottusangolo";}
         return l + ang;
	//... completare
   }
   
   /*
      restituisce una stringa contenente una descrizione testuale dell'oggetto
      nel formato T(a, b, c)
      Esempio "T(3, 4, 5)"
   */
   public String toString()
   {return "T(" + a + ", " + b + ", " + c + ")";
	//... completare
   }

    /*
       calcola e restituisce l'area del triangolo.
       Usa la formula di Erone:
            area * area = p * (p - a) * (p - b) * (p - c)
       dove p e` il semiperimetro, ovvero p = (a + b + c) / 2
    */
    public double area()
    {  double p= this.perimetro();
       double area2 = p * (p - a) * (p - b) * (p - c);
       return Math.sqrt(area2);
	//... completare
    }
   
    /*
       calcola e restituisce l'altezza del triangolo relativa al lato maggiore:
    */
    public double h()
    {   double a = this.area();
        return (2*a/c);
	//... completare
    }

public double perimetro()
    { return a+b+c;
	//... completare
    }

  //... variabili di esemplare... da completare
  //...

}
