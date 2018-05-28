package arrays.arraymath;

import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class AddOneToNumberTest {
    private final AddOneToNumber addOneToNumber = new AddOneToNumber();

    @Test
    public void plusOne_123_returns124() {
        ArrayList<Integer> input = new ArrayList<>(asList(1, 2, 3));

        ArrayList<Integer> result = addOneToNumber.plusOne(input);

        assertThat(result).containsExactly(1, 2, 4);
    }

    @Test
    public void plusOne_0123_returns124() {
        ArrayList<Integer> input = new ArrayList<>(asList(0, 1, 2, 3));

        ArrayList<Integer> result = addOneToNumber.plusOne(input);

        assertThat(result).containsExactly(1, 2, 4);
    }

    @Test
    public void plusOne_99_returns100() {
        ArrayList<Integer> input = new ArrayList<>(asList(9, 9));

        ArrayList<Integer> result = addOneToNumber.plusOne(input);

        assertThat(result).containsExactly(1, 0, 0);
    }

    @Test
    public void plusOne_000_returns1() {
        ArrayList<Integer> input = new ArrayList<>(asList(0, 0, 0));

        ArrayList<Integer> result = addOneToNumber.plusOne(input);

        assertThat(result).containsExactly(1);
    }
}
