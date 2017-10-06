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
        //set variables 
      int pos, j, minIndex, temp;
      int n = array.length;
      for (pos = 0; pos < n - 1; pos++) {
            minIndex = pos;
            for (j = pos + 1; j < n; j++)
                  if (array[j] < array[minIndex])
                        minIndex = j;
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
