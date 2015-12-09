public class TicTacToeBoard
{  /* costruttore che crea la scacchiera con i puntini
   */
   public TicTacToeBoard()
   {  String[][] mappa = new String[3][3];
   }
   /* restituisce una stringa da usare per visualizzare la scacchiera
      (deve contenere anche i caratteri per andare a capo al termine
       di ogni riga)
   */
   public String toString()
   {  String s = "";
      int i,k,h = 0;
         while (i<3){
            s += getCharInPosition(0, i);
            i++;
            }
         s = s + "\n"; 
         while (k<3){
            s += getCharInPosition(1, i);
            k++;
            }
         s = s + "\n"; 
         while (h<3){
            s += getCharInPosition(2, i);
            h++;
            }
       return s;
   }
   /* imposta la posizione [row][column] al valore c
      lancia IllegalArgumentException se le coordinate sono errate
      restituisce falso se e solo se la posizione era gia' occupata
   */
   public boolean setCharInPosition(int row, int column, char c)
   {  
   }
   /* restituisce il carattere presente nella posizione [row][column] 
      lancia IllegalArgumentException se le coordinate sono errate
   */
   public char getCharInPosition(int row, int column)
   {  
   }
   /* restituisce il numero di posizioni occupate nella scacchiera
   */
   public int getCount()
   {        
            int i,k,h,s  = 0;
            while (i<3){
            if (getCharInPosition(0, i)== X || getCharInPosition(0, i)== O ) 
                s++;
            i++;
            }
         s = s + "\n"; 
         while (k<3){
            if (getCharInPosition(1, i)== X || getCharInPosition(1, i)== O ) 
                s++;
            k++;
            }
         s = s + "\n"; 
            if (getCharInPosition(0, i)== X || getCharInPosition(0, i)== O ) 
                s++;
            h++;
            }
   }
   /* restituisce vero se e solo se esiste nella scacchiera una
      configurazione vincente per il carattere c
   */
   public boolean isWinning(char c)
   {  
   }
}
