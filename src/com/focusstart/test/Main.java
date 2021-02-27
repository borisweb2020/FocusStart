package com.focusstart.test;

import java.util.Arrays;


public class Main {
    public static void main(String[] args){

        int[] firstArray = {1, 4, 9, 9};
        int[] secondArray = {1, 8, 27};

        int[] myArray = concatArray(firstArray, secondArray);

        System.out.println(Arrays.toString(myArray));

                /* Insertion Sort */
        for (int left = 0; left < myArray.length; left++){
            int newValue = myArray[left];
            int i = left - 1;
            for(; i >=0; i--){
                if(newValue < myArray[i]){
                    myArray[i+1] = myArray[i];
                } else {
                    break;
                }
            }
            myArray[i+1] = newValue;
        }
        System.out.println(Arrays.toString(myArray));

    } // === the end of main()

                /*The Arrays Concatenation */
    static int[] concatArray(int[] array_1, int[] array_2){
        int[] array;
        int n = array_1.length + array_2.length;
        array = new int[n];
        int count = 0;

        for(int i = 0; i < array_1.length; i++){
            array[i] = array_1[i];
            count++;
        }

        for (int j = 0; j < array_2.length; j++){
            array[count++] = array_2[j];
        }
        return array;
    }

}
