package java.practice;

/**
 * @author Bolin Zeng
 * @version  (Object-oriented programming)
 *
 * Date: 2/24, 2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 07
 *
 * Practice Problem: CodingBat - Recursion-1 > powerN
 *
 * Problem Description:
 * Given base and n that are both 1 or more, compute recursively (no loops) the value of
 * base to the n power, so powerN(3, 2) is 9 (3 squared).
 *
 * powerN(3, 1) → 3
 * powerN(3, 2) → 9
 * powerN(3, 3) → 27
 *
 * Input: num(the number of base), square(the number of square)
 * Output: num^square.(result)

 * Source: CodingBat
 */
public class PowerN {

    private PowerN(){
    }
    /**
     *
     * @param num the number of base.
     * @param square the number of square.
     * @return recursively call the method.
     */
    public static int powerN(int num, int square){
        if (square == 1){
            return num;
        }
        if (square == 0){
            return 1;
        }
        return num * powerN(num, square-1);
    }
}
