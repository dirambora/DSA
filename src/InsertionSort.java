public class InsertionSort {

    //Function to sort an array using insertion sort

    void sort(int arr[])
    {
        // calculate length of the array
        int n =arr.length;
        //initialize a for loop that iterates over the elements of the array
        for (int i=0; i<n; i++){
            //this line stores the value of the element at the current position 'i' in the variable key
            int key=arr[i];
            //initialuze variable j to i-1 which represents the last index of the last element in the sorted part of array
            int j=i-1;

            //while loop j>=0 makes sure j does not go out of bounds
            //check if the element at the current position j in the sorted part of the array is greater than the key element

            while (j >=0 && arr[j]>key ){
                //copy the value at index j and shift one position to the right
                arr[j+1] =arr[j];
                //after shifting an element to the right, the value of 'j' is decremented which means you move
                //one position to the left in the sorted part of the array to check if more shifting is needed.
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

        int arr[]={12,11,13,4,6};
        InsertionSort obj =new InsertionSort();
        obj.sort(arr);

        printArray(arr);



    }


    //Initialization

}
