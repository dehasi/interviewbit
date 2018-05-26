package arrays.primers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class SpriralOrderMatrixTest {
    private final SpriralOrderMatrix matrix = new SpriralOrderMatrix();


    @Test
    public void spiralOrder_1x1_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1);
    }

    @Test
    public void spiralOrder_1x3_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1,2,3))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1,2,3);
    }

    @Test
    public void spiralOrder_2x2_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1, 2)),
                new ArrayList<>(asList(3, 4))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 4, 3);
    }

    @Test
    public void spiralOrder_2x3_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1, 2, 3)),
                new ArrayList<>(asList(4, 5, 6))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 3, 6, 5, 4);
    }

    @Test
    public void spiralOrder_3x3_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1, 2, 3)),
                new ArrayList<>(asList(4, 5, 6)),
                new ArrayList<>(asList(7, 8, 9))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 3, 6, 9, 8, 7, 4, 5);
    }

    @Test
    public void spiralOrder_3x2_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1, 2)),
                new ArrayList<>(asList(3, 4)),
                new ArrayList<>(asList(5, 6))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 4, 6, 5, 3);
    }

    @Test
    public void spiralOrder_3x1_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1)),
                new ArrayList<>(asList(2)),
                new ArrayList<>(asList(3))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 3);
    }

    @Test
    public void spiralOrder_4x4_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1, 2, 3, 4)),
                new ArrayList<>(asList(5, 6, 7, 8)),
                new ArrayList<>(asList(9, 10, 11, 12)),
                new ArrayList<>(asList(13, 14, 15, 16))

        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
    }

    @Test
    public void spiralOrder_4x2_ok() {
        List<ArrayList<Integer>> test = new ArrayList<>(asList(
                new ArrayList<>(asList(1, 2)),
                new ArrayList<>(asList(3, 4)),
                new ArrayList<>(asList(5, 6)),
                new ArrayList<>(asList(7, 8))
        ));

        List<Integer> result = matrix.spiralOrder(test);
        assertThat(result).containsExactly(1, 2, 4, 6, 8, 7,  5, 3);
    }
}
