import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
                System.out.println("Welcome to Prime number ");
                System.out.println("Enter   number  :  ");
                    int num = input.nextInt(); 
                    boolean bool = isPrime(num);
                    if(bool){
                        System.out.println("Your number is prime");
                    }
                    else{
                        System.out.println("not prime hoeeeee");
                    }


    }
    public static boolean isPrime(int num ){
            int i =2;
            while(i < num){
                if(num % i ==  0){
                    return false;
                }
                i++;
            }
        return true;
    }
}
