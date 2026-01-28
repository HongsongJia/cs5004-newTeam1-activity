/**
 * CodingBat Practice Problem: Array-1 front11
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
 * If either array is length 0, ignore that array.
 * Source: https://codingbat.com/prob/p128270
 * @author Hongkun Yi
 */

import java.util.Arrays;

public int[] front11(int[] a, int[] b) {
    boolean hasA = a.length > 0;
    boolean hasB = b.length > 0;
    
    if (hasA && hasB) return new int[]{a[0], b[0]};
    if (hasA) return new int[]{a[0]};
    if (hasB) return new int[]{b[0]};
    return new int[0];
}

        // Test 1: [1, 2, 3], [7, 9, 8] -> [1, 7]
        int[] a1 = {1, 2, 3};
        int[] b1 = {7, 9, 8};
        System.out.println("Test 1: " + Arrays.toString(solver.front11(a1, b1)));

        // Test 2: [1], [2] -> [1, 2]
        int[] a2 = {1};
        int[] b2 = {2};
        System.out.println("Test 2: " + Arrays.toString(solver.front11(a2, b2)));

        // Test 3: [1, 7], [] -> [1]
        int[] a3 = {1, 7};
        int[] b3 = {};
        System.out.println("Test 3: " + Arrays.toString(solver.front11(a3, b3)));
    }
}
