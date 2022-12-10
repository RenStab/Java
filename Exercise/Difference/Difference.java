import java.util.Scanner; 


class user {
   public static void main(String[] args){
   
      Scanner diff = new Scanner(System.in);
      System.out.print("Enter a number: " );
      int num1 =  diff.nextInt();
      
      System.out.print("Enter the second number: ");
      int num2 = diff.nextInt();
      
      int difference = num1 * num2;
      System.out.print("Difference: " + difference);
      
   }
   
}
      