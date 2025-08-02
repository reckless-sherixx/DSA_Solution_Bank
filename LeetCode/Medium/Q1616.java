package LeetCode.Medium;

public class Q1616 {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        return i >= j;
    }

    boolean check(String a , String b){
        int i = 0 , j = a.length() - 1;
        while(i < j && a.charAt(i) == b.charAt(j)){
            i++;
            j--;
        }
        if(i>=j) return true;
        return isPalindrome(a.substring(i , j+1)) || isPalindrome(b.substring(i , j+1));
    }
}
