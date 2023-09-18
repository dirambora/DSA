public class InsertionSort2 {





    void insertionSort(int arr[]){
        int n =arr.length;

        for (int i=0; i<n; i++){
            int key = arr[i];

            int j =i-1;

            while (j>=0  && arr[j]>key ){
                arr[j+1] =arr[j];
                j=j-1;
            }

            arr[j+1] =key;
        }
    }



    //print array of size n
    static void  printArray(int arr[])
    {
        // calculate length of the array
        int n =arr.length;
        //initialize a for loop that iterates over the elements of the array
        for (int i=0; i<n; i++)
            System.out.println(arr[i] + "");
        System.out.println();
    }
    public static void main(String[] args) {

        int arr[]={31,14,59,26,41,58};
        InsertionSort obj =new InsertionSort();
        obj.sort(arr);

        printArray(arr);
    }
}
