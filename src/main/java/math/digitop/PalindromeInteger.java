package math.digitop;

public class PalindromeInteger {
    public int isPalindrome(int a) {
        if (a <0) return 0;
        int x = a;
        int val = 0;
        while (x > 0) {
            val *= 10;
            val += (x % 10);
            x /= 10;
        }
        return (a == val) ? 1 : 0;
    }
}
