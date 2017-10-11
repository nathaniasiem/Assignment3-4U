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
    public void insertionSort(String [] wd){
        //go through the array of words
        for (int i=0;i<wd.length;i++){
            //create a variable to keep track the position
            int spot = i;
            //keep program running when position
            while(spot>0 && wd[spot-1].compareToIgnoreCase(wd[spot])>0){
                //swap integers according  to the alphabetical order
                String temp = wd[spot];
                wd[spot]=wd[spot-1];
                wd[spot-1]=temp;
                //decreases until reach the very last word
                spot--;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q5 test=new A3Q5();
        String[] wList = {"Food","Cake","Job","School","Samsung"};
        for (int i=0; i<wList.length;i++){
            test.insertionSort(wList);
            System.out.println(wList[i]);
        }
    }
}
