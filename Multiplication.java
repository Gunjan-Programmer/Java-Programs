import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number to print table :  ");
            int num = input.nextInt();

            for(int i = 1;i<=10;i++){
                System.out.println(num + " *  " + i + " = " + num*i);
            }
        }
         catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }   
}
