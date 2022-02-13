package berezyak.vadim;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static int[] reverseArr(int[] arr){

        int k = 0;
        for (int i = 0; i < arr.length/2; i++) {
            k=arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = k;
        }
    return arr;
    }

    public static void main(String[] args) {
       int[] arr = new int[] {1,2,3,4,5,0,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
