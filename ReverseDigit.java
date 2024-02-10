import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to Reverse the digit :");
        System.out.println("Enter a number : ");
        int num = inp.nextInt();

        int result = reverse(num);
        System.out.println("The reverse of number is : " + result);
    }
    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit  = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }   
        return newNum;
        
    }
}
