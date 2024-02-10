import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome to Sorted array finder .");
        System.out.println("Enter the length of array");
        int len = inp.nextInt();
        int i = 0;
        int[] arr = new int[len];

        // System.out.println("Enter the elements of array");
        while (len > i) {
            System.out.println("Enter index of " + (i + 1) + " value : ");
            arr[i] = inp.nextInt();
            i++;
        }
        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);

        if (isInc || isDec) {
            System.out.println("Your array is sorted :) ");
        }
        else{
            System.out.println("your array is not sorted   :(");
        }
    }

    public static boolean isIncreasing(int[] arr) {

        int i = 1;
        while (i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;

    }

    public static boolean isDecreasing(int[] arr) {

        int i = 1;
        while (i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;

   }
}
