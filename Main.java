import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // create a scanner for user input
Scanner input = new Scanner(System.in);

   //define a variable for the integer 3
   final int A =  3;

   //define a variable for the integer 5
   final int B = 5;

  //put the ascending numbers in order
  if(A<= B){
   System.out.println("Your numbers in ascending order are 3, 5");
  } else {
  System.out.println("Your numbers in ascending order are 5, 3");
  }
 
 //define a variable for the integer 4
 final int C = 4;

 //define a variable for the integer 4
 final int D = 4;
 if(C<= D){
 System.out.println("Your numbers in ascending order are 4, 4");
 }
  }
}
