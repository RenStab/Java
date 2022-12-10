import java.util.Scanner;

public class PreFinals_1{
   public static void main(String[] args){
   //declaring the scanner and entry
      Scanner san = new Scanner(System.in);
      char entry;  
   
   //function loop
      do{
      //getting an input to the user
         System.out.print("Enter two numbers\n");
         System.out.print("First Number: ");
         int a = san.nextInt();
         System.out.print("Second Number: ");
         System.out.print("");
         int b = san.nextInt();
      
      //picking the options
         System.out.println("\n Options: \n 1. Sum \n 2. Absolute Difference \n 3. Product \n 4. Quotient \n 5. Modulo ");
         System.out.print("\nSelect an option: " );
         int c = san.nextInt();
         System.out.print("");
      
      // the options
         switch(c){
            case (1):
            
               System.out.print("The sum of two numbers is " + add(a, b));
               break;
            case (2):
               System.out.print("The difference of two numbers is " + diff(a, b));
               break;
            case (3):
               System.out.print("The product of two numbers is " + product(a, b));
               break;
            case (4):
               System.out.print("The quotient of two numbers is " + quotient(a, b));
               break;
            case (5):
               System.out.print("The modulo of two numbers is " + modulo(a, b));
               break;
            default:
               System.out.print("Invalid!");
         }
      
      
      // asking if the user wants another entry
         System.out.print("\nAnother entry? [Y/N]: ");
         entry = san.next().charAt(0);
      
      // to repeat the whole program
      }while(entry != 'n' && entry !='N');
   }
   
   // method for add
   private static int add(int a, int b){
      int sum = a + b;
      return sum;
   }
   
   // method for absolute difference
   private static int diff(int a, int b){
      int difference = Math.abs(a - b);
      return difference;
   }
   
   // method for product
   private static int product(int a, int b){
      int mult = a * b;
      return mult;
   }
   
   // method for quotient
   private static int quotient(int a, int b){
      int div = a / b;
      return div;
   }
   
   //method for modulo
   private static int modulo(int a, int b){
      int rem = a % b;
      return rem;
   }
}
