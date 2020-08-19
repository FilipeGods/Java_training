// Create GradeBook2 object and pass a String to
// its displayMessage method.
import java.util.Scanner; // program uses Scanner

public class GradeBookTest2
{
   // main method begins program execution
   public static void main( String[] args )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      // create a GradeBook2 object and assign it to myGradeBook
      GradeBook2 myGradeBook = new GradeBook2();

      // prompt for and input course name
      System.out.println( "Please enter the course name:" );
      String courseName = input.nextLine(); // read a line of text
      System.out.println(); // outputs a blank line

      // call myGradeBook2's displayMessage method
      // and pass courseName as an argument
      myGradeBook.displayMessage( courseName );
   } // end main
} // end class GradeBookTest2


