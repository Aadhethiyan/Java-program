import java.util.Scanner;

public class table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the table :");
        int a= sc.nextInt();

        for(int i=1;i<=a;i++)
        {
        System.out.println(a+"x"+i+"="+(a*i));
        }
    }
}