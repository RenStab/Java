import java.util.Scanner;


class nested{

   public static void main(String[] args){
   
   Scanner t = new Scanner(System.in);
   int input1, i, o, s, minus, div;
   String output;
   
   System.out.print("Enter a number: ");
   input1 = t.nextInt();
   output= "The factors of " + input1 + " is ";
   System.out.println(output);
   
   minus = input1/2;
   div = minus/2;
   
   for (i = 1; i * 1 <= Math.sqrt(input1); ++i){
      if (input1 % i == 0) {
         System.out.println(i + ", " + input1 / i );
      }
   }
  }
 }
