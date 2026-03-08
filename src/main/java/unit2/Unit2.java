package unit2;

public class Unit2 {

    public static void main(String[] args) {
        // Test your methods here by calling them and printing the results
    	System.out.println("Test methods here...");
    }

    /**
     * Concatenates two strings with a space in between.
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The concatenated string with a space in between.
     */
    public static String concatenateStrings(String str1, String str2) {
        // TODO: Implement this method using String concatenation
        String newstr = str1 + " " + str2;
        return newstr;
    }

    /**
     * Returns the square root of a given number.
     * @param number The number to find the square root of.
     * @return The square root of the number.
     */
    public static double calculateSquareRoot(double number) {
        // TODO: Implement this method using Math.sqrt
        return Math.sqrt(number);
    }

    /**
     * Converts a string to uppercase.
     * @param str The string to convert.
     * @return The string in uppercase.
     */
    public static String toUpperCase(String str) {
        // TODO: Implement this method using String.toUpperCase
        String newstr = str.toUpperCase();
        return newstr;
    }

    /**
     * Returns the maximum of two integers.
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The maximum of the two integers.
     */
    public static int findMax(int num1, int num2) {
        // TODO: Implement this method using Math.max
        int max = Math.max(num1, num2);
        return max;
    }

    /**
     * Returns the length of a string.
     * @param str The string to check.
     * @return The length of the string.
     */
    public static int getStringLength(String str) {
        // TODO: Implement this method using String.length
        int length = str.length();
        return length;
    }

    /**
     * Rounds a double value to the nearest integer.
     * @param value The value to round.
     * @return The rounded integer.
     */
    public static int roundValue(double value) {
        // TODO: Implement this method using Math.round
        int newnum = Math.round(value);
        return newnum;
    }

    /**
     * Returns a substring of the given string.
     * @param str The original string.
     * @param beginIndex The beginning index, inclusive.
     * @param endIndex The ending index, exclusive.
     * @return The specified substring.
     */
    public static String getSubstring(String str, int beginIndex, int endIndex) {
        // TODO: Implement this method using String.substring
        String newstr = str.substring(beginIndex, endIndex);
        return newstr;
    }

    /**
     * Returns the absolute value of an integer.
     * @param number The number to find the absolute value of.
     * @return The absolute value of the number.
     */
    public static int getAbsoluteValue(int number) {
        // TODO: Implement this method using Math.abs
        int newnum = Math.abs(number);
        return newnum;
    }

    /**
     * Replaces all occurrences of a specified character in a string.
     * @param str The original string.
     * @param oldChar The character to be replaced.
     * @param newChar The character to replace with.
     * @return The string with replaced characters.
     */
    public static String replaceCharacter(String str, char oldChar, char newChar) {
        // TODO: Implement this method using String.replace
        return str.replace(oldChar, newChar);
    }

    /**
     * Returns the result of raising a base to a power.
     * @param base The base value.
     * @param exponent The exponent value.
     * @return The result of base raised to the power of exponent.
     */
    public static double powerOf(double base, double exponent) {
        // TODO: Implement this method using Math.pow
        double num = Math.pow(base, exponent);
        return num;
    }
}