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
        for (int i=0;i<word.length;i++){
            int spot = i;
            while(spot>0 && word[spot-1].compareToIgnoreCase(word[spot])>0){
                String temp = word[spot];
                word[spot]=word[spot-1];
                word[spot-1]=temp;
                spot--;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q5 test=new A3Q5();
        String[] wordList = {"Food","Cake","Job","School","Samsung"};
        for (int i=0; i<wordList.length;i++){
            test.insertionSort(wordList);
            System.out.println(wordList[i]);
        }
    }
}
