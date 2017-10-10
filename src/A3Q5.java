/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author candy
 */
public class A3Q5 {
    public void insertionSort(String [] word){
        //go through the array of word
        for (int i=0;i<word.length;i++){
            //create a variable to keep track the position
            int spot = i;
            //keep program running when position
            while(spot>0 && word[spot-1].compareToIgnoreCase(word[spot])>0){
                //swap integers according  to the alphabetical order
                String temp = word[spot];
                word[spot]=word[spot-1];
                word[spot-1]=temp;
                //decreases until reach the very last word
                spot--;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a variable to test the boundaries
        A3Q5 test=new A3Q5();
        //create an array of words
        String[] wordList = {"Food","Cake","Job","School","Samsung"};
        //loop to go through each word and print out the sorted list
        for (int i=0; i<wordList.length;i++){
            //call the method
            System.out.println(wordList[i]);
        }
    }
}
