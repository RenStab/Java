import java.util.Scanner;

class Celiofar {
    public static void main(String [] args) {
        
        Scanner marc = new Scanner(System.in);
        System.out.println("Input temperature in Celsius: ");
        
        double cel = marc.nextDouble();
        double Far1 = cel * 9/5 + 32; 
        System.out.println("The equivalent temperature in fahrenheit is:  " + Far1);
    }
}