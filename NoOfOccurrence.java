import java.util.Scanner;

public class NoOfOccurrence {
 public static void main(String[] args) {
    
    Scanner inp = new Scanner(System.in);

    System.out.println("Welcome to Number of occurrence");
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
    System.out.println("Now enter a number to finds its occurrence");
    int search = inp.nextInt();
    System.out.println("... Loading ");
    System.out.println("... Searching in the arr");

    int occur = checkOccurrence(arr, search);
    if(occur == 0){
        System.out.println("Your number is not found :(  ");
    }
    else{
        System.out.println("Your number found");
        System.out.println("Number of occurrence is : " + occur);
    }


 }  
 public static int checkOccurrence(int[] arr , int search){

    int len = arr.length;
    int i =0;
    int count = 0;
    while(len > i){
        if(arr[i] == search){
            count ++;
        }
        
        
        i++;
    }

    return count;
} 
}
