// Bubble Sort 
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn< arr.length - 1; turn++) {
            for(int j = 0; j< arr.length -turn -1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void getArray(int arr[]) {
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 3, 1, 9 };
        bubbleSort(arr);
        getArray(arr);
    }
}