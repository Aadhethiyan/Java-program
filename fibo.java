import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
         System.out.print("Fibonacci Series: ");
        int n = a.nextInt();
        int first = 0, second = 1;

       
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int b = first + second;
            first = second;
            second = b;
        }
    }
}