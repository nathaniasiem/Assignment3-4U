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
        int last=array.length;
        //boolean to flag a swap
        boolean swap = true;
        //continue if swap has been made
        while(swap){
            // assume no swaps will be done
            swap=false;
            //look for swaps
            for (int i=0;i<last;i++){
                
            }
            
        }
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
        test.selectSort(numbers);

        //AFTER
        System.out.println("AFTER: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
