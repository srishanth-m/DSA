package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 5, 6, 7, 8};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(swap(arr , 0 , 6)));

//        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] swap(int[] arr , int index1 , int index2){
        int ref = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = ref;
        return arr;
    }

    static int max(int[] arr){
        int grt = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > grt){
                grt = arr[i];
            }
        }
        return grt;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
