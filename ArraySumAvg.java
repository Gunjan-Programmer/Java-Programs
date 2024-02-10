import java.util.Scanner;

public class ArraySumAvg {
 public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.println("Welcome to array - sum and average");
    System.out.println("Enter the length of array");
    int len = inp.nextInt();
    int i = 0;
    int[] arr = new int[len];

    System.out.println("Enter the elements of array");
    while(len > i){
        System.out.println("Enter index of " + i + " value : ");
        arr[i] = inp.nextInt();
        i++; 
    }
    long sum = sum(arr);
    double average = average(arr);
    System.out.println("Sum of numbers is : " + sum + " And average is numbers is : " + average(arr));

    System.out.println("Array values are : ");
    for(int j = 0;j<=len-1;j++){
        System.out.println(arr[j]);
    }

 } 
 public static long sum(int[] arr){
    int i=0;
    long sum = 0;
    while (i < arr.length) {
        sum += arr[i];
        i++;
    }
    return sum;
 }  
 public static double average(int[] arr){
  
    
    double sum = sum(arr);



    return (sum / arr.length);
 } 
}
