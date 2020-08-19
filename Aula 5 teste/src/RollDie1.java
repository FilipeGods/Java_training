// Roll a six-sided die 6000 times.
import java.util.Random;
import javax.swing.JOptionPane;

public class RollDie1
{
   public static void main( String[] args )
   {
      Random randomNumbers = new Random(); // random number generator

      int frequency[] = new int[6]; // count of 1s rolled

      int face; // stores most recently rolled value
      
      String message = null;

      // tally counts for 6000 rolls of a die
      for ( int roll = 1; roll <= 6000; roll++ )
      {
         face = 1 + randomNumbers.nextInt( 6 ); // number from 1 to 6

         // determine roll value 1-6 and increment appropriate counter
         switch ( face )
         {
            case 1:
               ++frequency[0]; // increment the 1s counter
               break;
            case 2:
               ++frequency[1]; // increment the 2s counter
               break;
            case 3:
               ++frequency[2]; // increment the 3s counter
               break;
            case 4:
               ++frequency[3]; // increment the 4s counter
               break;
            case 5:
               ++frequency[4]; // increment the 5s counter
               break;
            case 6:
               ++frequency[5]; // increment the 6s counter
               break; // optional at end of switch
         } // end switch
      } // end for

      for(int counter=1;counter<=6;counter++) {	
    	  message = message + Integer.toString(frequency[counter]);
      }
      
      JOptionPane.showMessageDialog(null, message);
      
   } // end main
} // end class RollDie

