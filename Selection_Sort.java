import java.util.Scanner;

// public class Selection_Sort {

//     public static void main(String[] args) {
//         int arr[] ={6,5,2,8,9,4};
//         int size = arr.length;
//         int temp = 0;
//         int minindex = -1;
        
//         System.out.println("Before Sorting: ");
//         for(int i =0;i<size;i++){
//             System.out.print(arr[i]);
//         }

//         for(int i=0;i<size-1;i++){

//             minindex = i;
//             for(int j=i+1;j<size;j++){
                
//                 if(arr[minindex]>arr[j]){
//                     minindex = j;
//                 }
//             }
//             temp = arr[minindex];
//             arr[minindex]=arr[i];
//             arr[i] = temp;
//         }
        
//         System.out.println();
//         System.out.println("After Sorting: ");
//         for(int i =0;i<size;i++){
//             System.out.print(arr[i]);
//         }  
//     }
// }
// USER INPUT METHOD;

public class Selection_Sort {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Eneter the size and then elements: ");
        int n = sc.nextInt();
        int arr[] =new int[n];
        
        int size = n;
        int temp = 0;
        int minindex = -1;
        
        for(int i =0;i<size;i++){
           arr[i]=sc.nextInt();
        }

        for(int i=0;i<size-1;i++){

            minindex = i;
            for(int j=i+1;j<size;j++){
                
                if(arr[minindex]>arr[j]){
                    minindex = j;
                }
            }
            temp = arr[minindex];
            arr[minindex]=arr[i];
            arr[i] = temp;
        }
        
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+ " ");
        } 
        sc.close(); 
    }
}
