package Exercises;

import java.util.Arrays;

//The method to compare two arrays of integers element-wise and computes a score for each element
//based on the comparison results. The method returns an array of two integers
//representing the scores of the two input arrays.

public class Second {
    public static void main(String[] args) {

        int[]alice = {2,3,4};
        int[]bob = {1,1,6};

        System.out.println(Arrays.toString(compareTriplets(alice,bob)));
    }
    static int[] compareTriplets(int[]a, int[] b){

        int difference;
        int aScore = 0;
        int bScore = 0;

        for(int i = 0; i<a.length; i++) {
            difference = a[i] - b[i];
            if(difference>0){
                aScore++;
            }else if(difference<0) {
                bScore++;
            }
        }
        return new int[]{aScore, bScore};
    }
}
