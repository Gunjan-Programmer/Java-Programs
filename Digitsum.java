import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print table :  ");
            int num = input.nextInt();  
        int sum = 0;
            while(num > 0){
                sum += num%10;
                num /=10;
            }
            System.out.println(sum);
    }
}
