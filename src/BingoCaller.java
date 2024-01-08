public class BingoCaller {

    /** COLUMN_LETTERS[i] represents the letter located at a particular index value i */
    private static final String[] COLUMN_LETTERS = {"B", "I", "N", "G", "O"};

    /** numbersCalled[i] represents whether or not the value i-1 has been called */
    private static boolean[] numbersCalled = new boolean[75];

    /* Returns a boolean indicating whether a value has been called.
     * Precondition: numbersCalled contains 75 boolean values
     * Postcondition: numbersCalled is unchanged
     */
    public static boolean hasBeenCalled(int num) {
        /* TODO in part (a) */
        return false;  // Replace this with your own return statement
    }

    /* Returns a random value based on the given letter
     * Precondition: letter is not null or an empty string
     * Postcondition: random value is between 1-15 for the letter "B", 16-30 for the letter
     *                "I", 31-45 for the letter "N", 46-60 for the letter "G", or
     *                61-75 for the letter "O", inclusive
     */
    public static int getRandomNumber(String letter) {
        /* TODO in part (b) */
        return -1;  // Replace this with your own return statement
    }

    /* Returns a String containing the column letter and value
     * of a randomly generated bingo call.
     * Precondition: numbersCalled contains 75 boolean values
     * Postcondition: numbersCalled is updated to indicate that a value has been called
     */
    public static String makeCall() {
        /* TODO in part (c) */
        return null; // Replace this with your own return statement
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
