import java.util.Scanner;
public class sumofnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int t=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
            t=sum%10;
        }
        System.out.println("Sum :"+t);
    }
}