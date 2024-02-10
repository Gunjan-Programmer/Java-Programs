import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Welcome to LCM");
                System.out.println("Enter first  number  :  ");
                    int first = input.nextInt();  
                System.out.println("Enter second  number  :  ");
                    int second = input.nextInt(); 
                int lcm = lcm1( first ,  second);
                System.out.println("LCM of two number is : " + lcm);
                
              
    }
    public static int lcm1(int first , int second){

        int i = 1;
        while(true){
              int factor = first * i;
            if(factor % second == 0){
                    return factor;

            }

            i++;
        }
}
}
