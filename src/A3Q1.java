/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A3Q1 {

    //modified selection sort
    public void selectionSort(int[] array) {
        //keep track of which position we are sorting
        for (int position = 0; position < array.length; position++) {
            //set minimum value
            int minNum = 1;
            //go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                //have we found a smaller number?
                if (array[minNum] < array[position]) {
                    //set new index of minimum value
                    minNum = position;
                }
            }
            if (minNum != position) {
                int temp = array[position];
                array[position] = array[minNum];
                array[minNum] = temp;
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q1 test = new A3Q1();
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
        test.selectionSort(numbers);

        //AFTER
        System.out.println("AFTER: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
