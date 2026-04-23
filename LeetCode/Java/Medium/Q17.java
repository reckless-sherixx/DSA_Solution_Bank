package LeetCode.Medium;

public class Q17 {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();
        return pad("", digits);
    }

    static String[] mapping = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    static List<String> pad(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String letters = mapping[digit];

        List<String> result = new ArrayList<>();
        for (char ch : letters.toCharArray()) {
            result.addAll(pad(p + ch, up.substring(1)));
        }

        return result;
    }
}
