import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int o = n;
        int sum = 0;

        int pow = String.valueOf(n).length();

        while (n > 0) {
            int d = n % 10;
            sum = sum + (int) Math.pow(d, pow);
            n = n / 10;
        }

        if (sum == o) {
            System.out.println("Given number is Armstrong");
        } else {
            System.out.println("Given number is not Armstrong");
        }

        sc.close();
    }
}