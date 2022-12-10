import java.util. Scanner; 


class user {
   public static void main(String[] args){
   
      
     Scanner name = new Scanner(System.in);
     System.out.print("First Name: ");
     String name1 = name.nextLine();
     
     System.out.print("Last Name: ");
     String Lastname = name.nextLine();
     
     System.out.print("Middle Initial: ");
     String midin = name.nextLine();
     
     System.out.print("Full Name: " + name1 + " " + midin + " " + Lastname);   
   }
}