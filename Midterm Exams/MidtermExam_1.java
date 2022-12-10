import java.util.Scanner;  

public class MidtermExam_1{

   public static void main(String[] args){
   
      int num1, num2, num3; 
      Scanner numb = new Scanner(System.in);
   
      System.out.print("Input the 1st number: ");
      num1 = numb.nextInt();
      System.out.print("Input the 2nd number: "); 
      num2 = numb.nextInt(); 
      System.out.print("Input the 3rd number: ");
      num3 = numb.nextInt();
   
      if (num1 > num2 && num1 > num3) {
         System.out.print("The greatest number among the three is " + num1);
      } 
      else if (num2 > num1 && num2 > num3) {
         System.out.print("The greatest number among the three is " + num2); 
      }
      else {
         System.out.print("The greatest number among the three is " + num3);
      }
   
   }
}