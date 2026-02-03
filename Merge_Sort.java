class Merge_Sort {

    public static void mergesort(int arr[], int l, int r){

        if(l<r){
            int mid = l + (r-l)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int arr[],int l,int mid,int r){

        int n1 = mid - l+1;
        int n2 = r-mid;

        int l_arr[] = new int[n1];
        int r_arr[] = new int[n2];

        for( int x =0; x<n1;x++){
            l_arr[x] = arr[l+x];  
        }
        for( int x =0; x<n2;x++){
             r_arr[x] = arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(l_arr[i] <= r_arr[j]){
                arr[k] = l_arr[i];
                i++;
            }
            else{
                arr[k] = r_arr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = l_arr[i];
            i++;
            k++;
        }
         while(j<n2){
            arr[k] = r_arr[j];
            j++;
            k++;
        }
       
    }

    public static void main(String[] args){

        int arr[] ={ 2,5,23,5,90,6,7,500,1};

        for(int n : arr){
            System.out.print(n+ " ");

        }
        mergesort(arr, 0, arr.length-1);

        System.out.println();
        System.out.println("After Sorting: ");
        for(int n : arr){
            System.out.print(n+ " ");

        }

    }
    
}
