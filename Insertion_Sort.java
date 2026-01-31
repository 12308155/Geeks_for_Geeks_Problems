import java.util.Scanner;
// public class Insertion_Sort {
//     public static void main(String[] args) {
        
//         int arr[] = { 9,5,2,7,8,1};
//         int size =arr.length;
//         System.out.print("Before Sorting: ");
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+ " ");

//         }

//         for(int i=1;i<size;i++){

//             int key = arr[i];
//             int j = i-1;

//             while(j>=0 && arr[j] >key){

//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//         System.out.println();
//         System.out.print("After  Sorting: ");
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }
    
// }
// INPUT METHOD

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and elements: ");

        int n = sc.nextInt();
        int arr[] =  new int[n];
        int size =n;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Before Sorting: ");
        for(int i=0;i<size;i++){
             System.out.print(arr[i]+ " ");
        }

        for(int i=1;i<size;i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] >key){

                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println();
        System.out.print("After  Sorting: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
    
}