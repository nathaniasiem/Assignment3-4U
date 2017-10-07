
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author candy
 */
public class A3Q2 {
    //use a modified binary search
    public int smallestMissingNumber(int array[], int start, int end) {
        //create a base case
        //all numbers to the end of the array are present
        //return number that is missing
        if (start > end) {
            return end + 1;
        }
        //condition to compare the first number if it is not the same
        //return the first number
        if (start != array[start]) {
            return start;
        }
        //use binary search method 
        //divide list in two 
        int mid = (start + end) / 2;

        //Check the left half of the list (all numbers from 0 to middle)
        if (array[mid] == mid) {
            
            return smallestMissingNumber(array, mid + 1, end);
        }
        return smallestMissingNumber(array, start, mid);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create variable to test boundaries
        A3Q2 test = new A3Q2();
         int arr[] = {0,1, 2, 3, 7, 8, 9, 11, 12};
        System.out.println("The smallest missing number is : "
                + test.smallestMissingNumber(arr, 0, arr.length - 1));

    }
}