
class Loop{
   public static void main(String[]args){
   
   int n = 12, num1 = 1, num2 = 1;
   
   for (int i = 1; i<=n; i++) {
      System.out.println(num1 + "");
      
      int sumNum = num1 + num2; 
      num1 = num2;
      num2 = sumNum;    
      }
   }  
}
   