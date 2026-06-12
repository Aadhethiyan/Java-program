import java.util.Scanner;
public class array{
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int  a[]=new int[n];
    for(int i=1;i<n;i++)
    {
        a[i]=sc.nextInt();

    }
    System.out.println(a);
    }
}