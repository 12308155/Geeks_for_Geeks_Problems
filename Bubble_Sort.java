// public class Bubble_Sort {
//     public static void main(String args[]){

//         int arr[] = {1,4,9,8,10,3};
//         int size = arr.length;
//         int temp = 0;

//         System.out.println("Before Sorting: ");
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+ " ");
//         }
//         for(int i=0;i<size;i++){
//             for(int j=0;j<size-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }

//         System.out.println();
//         System.out.println("After Sorting: ");
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }
    
// }
// USER INPUT METHOD
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i= 0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        
        int size = a;
        int temp = 0;

        System.out.println("Before Sorting: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
    
}
