import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to palindrome numbers .");
        System.out.println("Enter a number for a range to print palindrome numbers.");
        int num = inp.nextInt();
        boolean ispalindrome = reverse(num);
     
        if(ispalindrome){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("It is not palindrome number");
        }


       
        
    }
    public static boolean reverse(int num){
        int newNum  = 0;
        int numCopy = num;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum == numCopy;
    }
}
