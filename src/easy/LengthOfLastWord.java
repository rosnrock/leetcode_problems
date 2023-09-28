package easy;

// https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}
