import java.util.Scanner;

public class RandomNumberGenerator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number.");
        int first = sc.nextInt(); //should be nextInt()
        System.out.println("Enter second number.");
        int second = sc.nextInt(); //should be nextInt()
        int randomNumber = (int) (Math.random() * (second - first) ) + first;
        System.out.println("Your random number is: " + randomNumber);
    }

}
