package LeetCode.Medium;

public class Q848 {
    public String shiftingLetters(String s, int[] shifts) {
        long sum = 0;
        char res[] = s.toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) {
            sum += shifts[i];
            int charVal = res[i] - 'a';
            charVal = (int) ((charVal + sum) % 26);
            res[i] = (char) ('a' + charVal);
        }
        return new String(res);
    }
}
