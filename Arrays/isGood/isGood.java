/* This method checks if the input array is a permutation, 
i.e., it contains all the numbers from 0 to nums.length - 1, 
and returns true if it is a permutation, otherwise false.s */
public class Solution {
    public boolean isGood(int[] nums) {
        int maxElement = Integer.MIN_VALUE ; 

        //Find max element 
        for(int i=0; i < nums.length; i++){
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }

        //Check if array is permutation
        if(maxElement == nums.length-1){
            return true;
        }
        
        else{
            return false;
        }

    }
}
