package practice;

import java.util.Arrays;

/**
 * @author Yanshi Liu
 * @version Object-oriented programming
 * @since: 3/4/2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 08
 *
 * Practice Problem: CodingBat - AP-2 - notAlone
 *
 * Problem Description:
 * We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. 
 * Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
 * Examples:
 * notAlone([1, 2, 3], 2) → [1, 3, 3]
 * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
 * notAlone([3, 4], 3) → [3, 4]
 * Source: CodingBat 
 */
public class NotAlone {
    /**
     * Returns a version of the given array where every instance of val which is alone
     * is replaced by the larger of its left or right neighbor.
     * @param nums the input array
     * @param val  the value to check for "aloneness"
     * @return the modified array
     */
    public static int[] notAlone(int[] nums , int val) {
        for (int i = 1; i < nums.length -1 ; i++){
            if ( nums [i] == val && nums[i-1]!=val && nums[i+1]!= val){
                nums[i] = Math.max (nums[i-1], nums[i+1]);
            }
        }
        return nums;     
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3}, 2)));           // [1, 3, 3]
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2))); // [1, 3, 3, 5, 5, 2]
        System.out.println(Arrays.toString(notAlone(new int[]{3, 4}, 3)));              // [3, 4]
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 2}, 2)));           // [1, 2, 2] right neighbor equals val, not alone
        System.out.println(Arrays.toString(notAlone(new int[]{2}, 2)));                 // [2] single element, no alone possible
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 1, 2}, 2)));        // [1, 1, 1, 2] multiple alone values
        
    }
}

//cd /Users/ysliu/Documents/CS5004/cs5004-newTeam1-activity/module08/main/java
//java NotAlone