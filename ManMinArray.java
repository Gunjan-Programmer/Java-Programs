import java.util.Scanner;

public class ManMinArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

    System.out.println("Welcome to Max and min finder .");
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
    int max = max(arr);
    int min = min(arr);
    System.out.println("Maximun number found in the array is : " + max);
    System.out.println("Minimun number found in the array is : " + min);



    }
    public static int max(int[] arr){
        int i = 0;
        int len = arr.length;
        int max = 0;
        while (len > i) {
            if(arr[i] > max ){
                max = arr[i];
 

            } 
            i++;
            
        }

        return max;
    }
    public static int min(int[] arr){
        int i = 0;
        int len = arr.length;
        int min = Integer.MAX_VALUE;
        while (len > i) {
            if(min > arr[i]){
                min = arr[i];


            } 
            i++;
            
        }

        return min;
    }
    
}
