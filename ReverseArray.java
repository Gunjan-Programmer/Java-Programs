import java.util.Scanner;

class ReverseArray{
    public static void main(String[] args) {
       
            System.out.println("Welcome to array reversal");
        int[] numArr = inputArray();

        reverse(numArr);
        System.out.println("Your reversed array is : ");
        displayArray(numArr);
    
    
    }
    public static void reverse(int[] arr){
        int i = 0;
        
        while (i < arr.length/2){
                int num = arr[i];
                arr[i] = arr[(arr.length - 1 ) - i];
                arr[(arr.length - 1 ) - i] = num;
            i++;
        }
    }
    public static void displayArray(int[] arr){
        
        int i =0;
    
    while(arr.length > i){
        System.out.print(arr[i] + " ");
        i++; 
    }

    } 


    public static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of array");
    int len = inp.nextInt();
    int i = 0;
    int[] arr = new int[len];

    // System.out.println("Enter the elements of array");
    while(len > i){
        System.out.println("Enter index of " + (i+1) + " value : ");
        arr[i] = inp.nextInt();
        i++; 
    }
    return arr;
    } 


}