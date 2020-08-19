// GradeBook4 constructor used to specify the course name at the
// time each GradeBook4 object is created.

public class GradeBookTest4
{
   // main method begins program execution
   public static void main( String[] args )
   {
      // create GradeBook4 object
      GradeBook4 gradeBook1 = new GradeBook4(
         "CS101 Introduction to Java Programming" );
      GradeBook4 gradeBook2 = new GradeBook4(
         "CS102 Data Structures in Java" );

      // display initial value of courseName for each GradeBook
      System.out.printf( "gradeBook1 course name is: %s\n",
         gradeBook1.getCourseName() );
      System.out.printf( "gradeBook2 course name is: %s\n",
         gradeBook2.getCourseName() );
   } // end main
} // end class GradeBookTest4


