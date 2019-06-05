/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int j = 0; j <t ; j++){
            int s = scan.nextInt();
            int arr[] = new int[s];
            for (int k = 0; k <s; k++){
                arr[k] = scan.nextInt();
            }
            bubbleSort(arr);

            for (int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[] arr){
        boolean swapped = true;
        int temp = 0;
        for (int m=arr.length -1; m >= 0; m-- ) {
            for(int i=0; i<m; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
            swapped = false;
        }

        return;
    }
}

