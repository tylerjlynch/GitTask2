import java.util.Scanner;

public class Average {

    public static void main (String [] args ) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter your first number: ");
        int a = scan.nextInt();
        System.out.println( "Enter your second number: ");
        int b = scan.nextInt();
        double average = (a + b)/2.0; //Changed the variable to double, (b - b)/2 has been changed to (a + b)/2.0
        System.out.println( average );
    }

}
