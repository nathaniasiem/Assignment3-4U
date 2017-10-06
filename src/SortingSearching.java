
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class SortingSearching {

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selectSort(int[] array) {
        //keep track of which position we are sorting
        for (int position = 0; position < array.length; position++) {
            //go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                //have we found a smaller number?
                if (array[i] < array[position]) {
                    //swap numbers
                    swap(array, i, position);
                }
            }
        }
    }

    public void bubbleSort(int[] array) {
        //keep track of end
        int last = array.length;
        //boolean to flag a swap
        boolean swap = true;
        //continue if swap has been made
        while (swap) {
            // assume no swaps will be done
            swap = false;
            //look for swaps
            for (int i = 0; i < last - 1; i++) {
                //find a bigger value?
                if (array[i] > array[i + 1]) {
                    //swap
                    swap(array, i, i + 1);
                    //set flag to true
                    swap = true;
                }
            }
            //move last position tracker
            last--;
        }
    }

    public void mergeSort(int[] array) {
        // if we are 1 item, we are done
        if (array.length <= 1) {
            return;
        }
        //divide into 2 arrays
        int split = array.length / 2;
        //create 2 arrays
        int[] front = Arrays.copyOfRange(array, 0, split);
        int[] back = Arrays.copyOfRange(array, split, array.length);

        //recursively sort
        mergeSort(front);
        mergeSort(back);

        //put numbers in correct spot
        int fSpot = 0;
        int bSpot = 0;
        for (int i = 0; i < array.length; i++) {
            //no more items in front array
            if (fSpot == front.length) {
                //put item from back array in 
                array[i] = back[bSpot];
                bSpot++;
                //put item from front array in
            } else if (bSpot == back.length) {
                //put item from front array
                array[i] = front[fSpot];
                fSpot++;

            } else if (front[fSpot] < back[bSpot]) {
                //put front item in 
                array[i] = front[fSpot];
                fSpot++;
            } else {
                array[i] = back[bSpot];
                bSpot++;
            }
        }
    }

    public void insertSort(int[] array) {
        //start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            //store position
            //so we don't modify our loop counter
            int position = i;
            //check values beside each other
            while (position >= 0 && array[position] > array[position + 1]) {
                //if out of place ,swap it downwards
                //until correct position is reached
                swap(array, position, position + 1);
                position--;
            }
        }
    }

    public int seqSearch(int[] array, int number) {
        //start going through array
        for (int i = 0; i < array.length; i++) {
            //did i find it?
            if (array[i] == number) {
                //tell them where
                return i;
            }
        }
        //didnt find it
        return -1;
    }

    //binary search
    public int binSearch(int[] array, int target) {
        //beginning of the list
        int min = 0;
        //end of the list
        int max = array.length - 1;
        //loop to keep going until number matches the middle number
        while (max > min) {
            //divide the list in two 
            int guess = (max + min) / 2;
            //find it??
            if (array[guess] == target) {
                return guess;
            } else if (target > array[guess]) {
                //check number in the top of the list
                min = guess + 1;
            } else {
                //check number in the left
                max = guess - 1;
            }
        }
        //didn't find it
        return -1;
    }

    public static void main(String[] args) {
        SortingSearching test = new SortingSearching();
        //making a random array of integers
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            //make random numbers
            numbers[i] = (int) (Math.random() * 101);
        }

        //BEFORE
        System.out.println("BEFORE: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //SORT HERE
        test.insertSort(numbers);

        //AFTER
        System.out.println("AFTER: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
