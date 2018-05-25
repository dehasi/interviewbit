package arrays.primers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class SpriralOrderMatrixTest {
    private final SpriralOrderMatrix matrix = new SpriralOrderMatrix();

    @Test
    public void test() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1, 2, 3)),
                new ArrayList<>(asList(4, 5, 6)),
                new ArrayList<>(asList(7, 8, 9))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 3, 6, 9, 8, 7, 4, 5);
    }
}
