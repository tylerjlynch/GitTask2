import java.util.Scanner;

public class Project
{
    public static void main(String args[])
    {
        System.out.println("What is your name?");
        //Fixed Scanner class name
        Scanner sc = new Scanner(System.in);
        //Changed to sc.nextLine
        String name = sc.nextLine();
        System.out.println("Your name backwards is:");
        String ans = "";
        // Fixed i++ to i--
        for (int i = name.length() - 1; i >= 0; i--)
        {
            ans += name.charAt(i);
        }
        System.out.println(ans);
    }
}
