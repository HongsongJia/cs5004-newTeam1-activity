/**
 * Date: 02/04/2026
 * Course: CS5004
 * Team: Team 2
 * Module: 04
 *
 * CodingBat Practice Problem: String-2 countCode
 *
 * Problem Description:
 * Return the number of times the string "co?e" appears in the given string,
 * where ? can be any letter.
 *
 * Examples:
 * countCode("aaacodebbb") → 1
 * countCode("codexxcode") → 2
 * countCode("cozexxcope") → 2
 *
 * Source: https://codingbat.com/prob/p13614
 *
 * @author YunmengzeFang
 */

public class YunmengzeFang {

    /**
     * Returns how many times "co?e" appears in the string.
     *
     * @param str the input string
     * @return number of occurrences of "co?e"
     */
    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co")
                    && str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }
}
