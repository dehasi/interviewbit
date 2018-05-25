package arrays.primers;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayImpl1Test {
    private final ArrayImpl1 arrayImpl1 = new ArrayImpl1();

    @Test
    public void test() {
        List<Integer> result = arrayImpl1.performOps(asList(5, 10, 2, 1));

        assertThat(result).containsExactly(5, 10, 2, 1, 5, 1, 2, 10);
    }
}
