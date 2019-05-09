public class Project
{
    public static void main()
    {
        System.out.println("What is your name?");
        scan sc = new Scan(System.in);
        String name = sc.next();
        System.out.println("Your name backwards is:");
        String ans = "";
        for (int i = name.length() - 1; i >= 0; i++)
        {
            ans += name.charAt(i);
        }
        System.out.println(ans);
    }
}
