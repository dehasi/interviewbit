package math.digitop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void reverse_x123_returns321(){
        assertThat(reverseInteger.reverse(123)).isEqualTo(321);
    }

    @Test
    public void reverse_minus123_returnsMinus321(){
        assertThat(reverseInteger.reverse(-123)).isEqualTo(-321);
    }

    @Test
    public void reverse_maxValue_ok(){
        //2147483647
        //7463847412
        assertThat(reverseInteger.reverse(Integer.MAX_VALUE)).isEqualTo(0);
    }

    @Test
    public void reverse_minValue_ok(){
        //-2147483648
        //-8463847412
        assertThat(reverseInteger.reverse(Integer.MIN_VALUE)).isEqualTo(0);
    }

    @Test
    public void reverse_ibt_ok(){
        assertThat(reverseInteger.reverse(-1146467285)).isEqualTo(0);
    }
}
