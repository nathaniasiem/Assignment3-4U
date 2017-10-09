/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author candy
 */
public class A3Q4 {

    public void countingSort(int[] n) {
        //create the base case to start 
        //helps to keep track in array
        int[] track = new int[101];
        //goes through the array
        for (int i = 0; i < n.length; i++) {
            //in every position, add 1 within the track
            track[n[i]]++;
        }
        //create a variable to keep track of position
        int tkr = 0;
        //runs through the 2nd set of numbers
        for (int i = 0; i < track.length; i++) {
            //keeps program running if not equal to zero
            while (track[i] != 0) {
                //sort array
                n[tkr] = i;
                //increase the position to connect 1st list with the 2nd list
                tkr++;
                //subtract 1 from the number each time
                track[i]--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create variable to test boundaries
        A3Q4 test = new A3Q4();
       //create an array of containing 8 numbers
       int [] noList = {15,21,3,78,90,3,2,2};
       
       for (int i = 0; i<noList.length;i++){
           //calling the method
           test.countingSort(noList);
           //printing the method
           System.out.println(noList[i]);
       }
    }

}
