import java.util.Scanner;

class DelEleArray {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome to Delete a array element.");
        int[] arr = inpArr();
        System.out.print("Enter a element to be deleted from array : ");
        int ele =inp.nextInt();
        int noOfOccur = NoOfOccurrence(arr ,ele);
        System.out.println("Number of occurrence is : " + noOfOccur  );  
        int newArraySize = arr.length - noOfOccur;
        System.out.println("New array size : " + newArraySize);

        
        int[] deletedArr = DeleteElement(arr, ele);

        int i = 0;
        while( i < deletedArr.length){
            System.out.print(deletedArr[i] + " , ");
            i++;
        }




       


    }
    //function to accept 
    public static int[] DeleteElement(int[] arr , int ele){
        int occ = NoOfOccurrence(arr ,ele);
        System.out.println("Number of occurrence is : " + occ  ); 
        if(occ == 0){
            return arr;
        }
        int newSize = arr.length - occ;
        System.out.println("New array size : " + newSize);
        int[] newArr = new int[newSize]; // 3

        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] != ele){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
        

    


    //function to fund occurrence of an element
    public static int NoOfOccurrence(int[] arr , int ele){
        int num = ele;
        int i =0;
        int count = 0;
        while (arr.length > i) {
                if(arr[i] == num){
                    count ++;
                }
                i++;
        }


        return count;
    }




    //Function to enter the elements of array and return array
    public static int[] inpArr(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of elements to be entered : ");
        int len = inp.nextInt();
        int i = 0;
        int[] arr = new int[len];

    // System.out.println("Enter the elements of array");
    while(len > i){
        System.out.print("Enter index of " + (i+1) + " value :  ");
        arr[i] = inp.nextInt();
        i++; 
    }
    return arr;

    }
 

}
