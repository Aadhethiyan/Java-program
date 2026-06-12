import java.util.Scanner;
public class vowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the letter : ");

        char n= sc.nextLine().charAt(0);
        if(n =='a' || n =='e' ||n =='i' || n == 'o' || n == 'u' || n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U'){
            System.out.print(n+ " is Vowel");
        }
        else{
            System.out.print(n+ " is consonant");
        }
    }
    
}