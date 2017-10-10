/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author candy
 */
public class A3Q3 {
    public int countOnes(int[]array){
        //create a base case to input the numbers
        int sum=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==1){
                sum++; 
        }
        
        }return sum;
    
}
    public static void main(String[] args) {
        // create variable to test boundaries
        A3Q3 test= new A3Q3();
         int[] array = {0,0,0,1,1,1};
        System.out.println(test.countOnes(array));  
    }
    
}
