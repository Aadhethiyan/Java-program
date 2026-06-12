import java.util.Scanner;
public class swapped {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
         System.out.print("Enter the A : ");
        int a = sc.nextInt();
        System.out.print("Enter the B : ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A :"+a);
        System.out.println("B :"+b);
    }
}