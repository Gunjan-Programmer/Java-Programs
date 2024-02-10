import java.util.Scanner;

class Chalange{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();
        
        System.out.println("Enter Second number");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
       System.out.println(add);
       System.out.println(sub);
       System.out.println(mul);
       System.out.println(div);
       System.out.println(mod);



    }}