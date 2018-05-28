package math.digitop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeIntegerTest {
    private final PalindromeInteger palindromeInteger = new PalindromeInteger();

    @Test
    public void isPalindrome_palindrome_1(){
        assertEquals(palindromeInteger.isPalindrome(12121),1);
    }

    @Test
    public void isPalindrome_noPalindrome_0(){
        assertEquals(palindromeInteger.isPalindrome(123121),0);
    }

    @Test
    public void isPalindrome_neg_0(){
        assertEquals(palindromeInteger.isPalindrome(-12121),0);
    }
}
