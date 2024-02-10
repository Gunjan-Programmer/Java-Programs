import java.util.Scanner;

class ArrayUtility {
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
    public static void displayArray(int[] arr){
        
        int i =0;
    
    while(arr.length > i){
        System.out.print(arr[i] + " ");
        i++; 
    }

    } 

}
