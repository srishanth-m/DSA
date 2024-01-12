package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCode {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
//        for (int i = 0 ; i < numbers.length ; i++){
//            numbers[i] = in.nextInt();
//        }
//
//        int[][] num = {
//                {1,2,3},
//                {4,5,6},
//        };
//
//        System.out.println(Arrays.toString(numbers));
//        change(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        for (int j = 0 ; j < num.length ; j++){
//            for (int k = 0 ; k < num[j].length ; k++){
//                System.out.println(num[j][k]);
//            }
//        }

//        int[][] arr = new int[3][3];
//        for (int row = 0 ; row < arr.length ; row++){
//            for (int col = 0 ; col < arr[row].length ; col++){
//                arr[row][col] = in.nextInt();
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }

//        ArrayList<Integer> arrayList = new ArrayList<>(10);

//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);

//        for (int j = 0 ; j < 5 ; j++ ){
//            arrayList.add(in.nextInt());
//        }
//
//        for (int i = 0 ; i < arrayList.size() ; i++){
//            System.out.print(arrayList.get(i) + " ");
//        }

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int k = 0 ; k < 3 ; k++){
            lists.add(new ArrayList<>());
        }

        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                lists.get(i).add(in.nextInt());
            }
        }

        System.out.println(lists);
    }

    static void change(int[]arr){
        arr[0] = 100;
    }
}
