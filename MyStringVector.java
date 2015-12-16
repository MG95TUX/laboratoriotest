public class MyStringVector
{private Object[] array;
 private int count;

   /*
      Costruisce un vettore vuoto.
   */
   public MyStringVector()
   {array = new Object[10];
    count=0;
   }
   
   /*
       Se l'elemento specificato (s) non vale null, aggiunge l'elemento s in coda a questo vettore,
       altrimenti termina senza fare niente.
   */
   public void add(String s)
   {if (s!= null){
       try array[count] = s;
       catch IndexOutofBoundsException(){
           Object[] newarray = new Object[count*2];
           System.arraycopy(array,0,arraycopy,0, count+1);
           array=newarray;}
       array[count] = s;
       count++;
      
   }
   
   /*
       Se 0 <= index <= size(), inserisce l'elemento specificato (s) nella posizione specificata in questo vettore.
       Sposta a destra l'elemento attualmente in quella posizione (se esiste) e ogni elemento successivo
       (aggiungendo uno al suo indice).
       Se index < 0 oppure index > size() termina senza fare niente.
       Termina senza fare niente anche se s vale null.
   */
   public void add(int index, String s)
   {if (array[index] != null){
       int tempcount= count;
       while(tempcount> index){
           array[tempcount] = array[tempcount-1];
           tempcount--;}
       }
     if (s!= null){
       try array[count] = s;
       catch IndexOutofBoundsException(){
           Object[] newarray = new Object[count*2];
           System.arraycopy(array,0,arraycopy,0, count+1);
           array=newarray;}
       array[index] = s;
       count++;
       
   }
   
   /*
      Restituisce la capacita' del vettore, cioe' la dimensione fisica dell'array interno.
   */
   public int capacity()
   {return (count-1)
   }

   /*
      Restituisce true se e solo se questo vettore contiene l'elemento specificato.
   */
   public boolean contains(String s)
   {int x = 0;
    while(x< count){
       if array[x].equals(s) return true;
       x++;}
    return false;
   }
   
   /*
      Se 0 <= index < size(), restituisce l'elemento presente in corrispondenza dell'indice specificato,
      altrimenti restituisce null.
   */
   public String elementAt(int index)
   {return array[index];
   }
   
   /*
      Restituisce l'indice della prima occorrenza dell'elemento specificato in questo vettore,
      oppure -1 se questo vettore non contiene l'elemento.
   */
   public int indexOf(String s)
   {int x = 0;
    while(x< count){
       if array[x].equals(s) return x;
       x++;}
    return -1;
   }
   
   /*
      Restituisce true se e solo se il vettore e' vuoto.
   */
   public boolean isEmpty()
   {if (count == 0) return true;
    return false;
   }
   
   /*
      Restituisce l'elemento massimo in ordine lessicografico presente in questo vettore.
      Se ci sono piu' massimi, ne restituisce uno qualsiasi.
   */
   public String max()
   {String test= ;
    
   }

   /*
      Restituisce l'elemento minimo in ordine lessicografico presente in questo vettore.
      Se ci sono piu' minimi, ne restituisce uno qualsiasi.
   */
   public String min()
   {
   }

   /*
      Rimuove tutti gli elementi di questo vettore e imposta la sua dimensione logica a zero.
   */
   public void makeEmpty()
   {
   }

   /*
      Se 0 <= index < size(), rimuove l'elemento che si trova in corrispondenza
      dell'indice specificato, restituendolo.
      Sposta a sinistra ogni elemento successivo (sottraendo uno al suo indice).
      Se index < 0 oppure index >=size() restituisce null.
   */
   public String remove(int index)
   {
   }

   /*
      Se 0 <= index < size(), sostituisce con l'elemento specificato (s) l'elemento presente
      in questo vettore nella posizione specificata.
      Se index < 0 oppure index >=size() restituisce null, altrimenti restituisce l'elemento
      precedentemente memorizzato nella posizione specificata.
   */
   public String set(int index, String s)
   {
   }

   /*
      Restituisce il numero di elementi presenti in questo vettore,
      cioe' la sua dimensione logica.
   */
   public int size()
   {
   }
   
   /*
      Restituisce un array contenente tutti gli elementi presenti in questo vettore,
      nell'ordine esatto in cui sono presenti nel vettore stesso (cioe' senza modificarne
      la reciproca posizione in alcun modo).
   */
   public String[] toArray()
   {
   }
   
   /*
      Restituisce una stringa contenente tutti gli elementi presenti in questo array,
      un elemento per riga (cioe' inserendo un carattere '\n' tra un elemento e l'altro),
      nell'ordine esatto in cui sono presenti nel vettore stesso (cioe' senza modificarne
      la reciproca posizione in alcun modo).
   */
   public String toString()
   {
   }
}
