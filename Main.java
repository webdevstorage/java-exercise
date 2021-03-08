// import java util
import java.util.*;

public class Main{
     public static void main(String []args){
        // print the programming specifications for the project. 
        System.out.println("Java Grade Calculator v1.1. Enter '999' to exit.");
        // declare an integer array
        List<Integer> gradesArray = new ArrayList<Integer>();
        // create an instance of Scanner for keyboard input
        Scanner keyboardInput = new Scanner(System.in);
        // print a message to screen
        System.out.println("Enter your quize grade! (integer)");

        // create a while loop that will loop until a user enters an integer above 999 
          while (true) {
            try {
            // assign 'userinput' variable to keyboard's input value
            int userinput = keyboardInput.nextInt();
            // check if user's input is smaller than 999. If user enters 999 or higher, the loop will break.
            if(userinput < 999) {
                // Check array's size. this loop will work until user enters 10th grade.
                if(gradesArray.size() < 9) {
                   // add user's input to grade array
                   gradesArray.add(userinput); 
                   // print a list of grades in array
                   System.out.println("All grades in array: " + gradesArray.toString()); 
                   // create averageGrade variable
                   int averageGrade = gradesArray.stream().mapToInt(value -> value).sum() / gradesArray.size();

                   // print average of grades in array
                   System.out.println("Grade average is: " + averageGrade ); 

                   // print letter grade of the average grade
                   if (averageGrade >= 90 && averageGrade <= 100) {
                    // print A if the average grade is between 90-100
                    System.out.println("Letter grade: A"); 
                   }

                   if (averageGrade >= 80 && averageGrade <= 89) {
                    // print B if the average grade is between 80-89
                    System.out.println("Letter grade: B"); 
                   }

                   if (averageGrade >= 70 && averageGrade <= 79) {
                    // print C if the average grade is between 70-79    
                    System.out.println("Letter grade: C"); 
                   }

                   if (averageGrade >= 60 && averageGrade <= 69) {
                    // print D if the average grade is between 60-69  
                    System.out.println("Letter grade: D"); 
                   }

                   if (averageGrade <= 59) {
                    // print F if the average grade is between 0-59      
                    System.out.println("Letter grade: F"); 
                   }

                   // print a message to screen
                   System.out.println("Enter your quize grade! (integer)");

                   continue;
                } else {
                   // when user enters 10th grade, force to enter 999 and the loop ends; 
                   gradesArray.add(999);
                   break;
                }
            } 
         }
            catch (InputMismatchException e) {
               // send an error message when user enters non-integer value
               System.out.println("Number entered was not an integer");
               break;
            }
            break;
          }
     }
}