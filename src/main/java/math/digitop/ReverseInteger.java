package math.digitop;

public class ReverseInteger {
    public int reverse(int a) {
        long x = a;
        int s = 1;
        if (x < 0) {
            s = -1; x = -1*x;
        }
        long val = 0;
        while (x > 0) {
            val *= 10;
            long l = x%10;
            val += l;
            x /=10;
        }
        int t = (int)val;
        if (t != val) return 0;
        return s*t;
    }

}
