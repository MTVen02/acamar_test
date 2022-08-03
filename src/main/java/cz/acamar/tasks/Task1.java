package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWordSimple(String str) {
        String[] stringArr = str.split(" ");
        return stringArr.length > 0? stringArr[stringArr.length - 1].length() : -1;
    }

    public int lengthOfLastWord(String str) {
        int resultLen = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                resultLen++;
            } else if (resultLen > 0) {
                break;
            }
        }
        return resultLen;
    }
}
