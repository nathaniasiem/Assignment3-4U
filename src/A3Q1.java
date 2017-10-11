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
       //set variables to help with swap 
      int pos, m, minIndex, temp;
     
      //keep track of which position we are in
      //subtract 1 from length to check if we reached the last value
      for (pos = 0; pos < array.length - 1; pos++) {
            minIndex = pos;
            //go through each number
            for (m = pos + 1; m < array.length; m++)
                //find the smallest number
                  if (array[m] < array[minIndex])
                        minIndex = m;
            //condition when the small number is not in position
            //swap
            if (minIndex != pos) {
                  temp = array[pos];
                  array[pos] = array[minIndex];
                  array[minIndex] = temp;
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
