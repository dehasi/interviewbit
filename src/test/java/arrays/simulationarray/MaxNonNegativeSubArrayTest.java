package arrays.simulationarray;

import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxNonNegativeSubArrayTest {
    private final MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();


    @Test
    public void subset_oneNegAtBeginning_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(-1, 1, 2, 5, -7, 2, 3));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).containsExactly(1, 2, 5);
    }

    @Test
    public void subset_oneNegAtEnd_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(1, 2, 5, -7, 2, 3, -1));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).containsExactly(1, 2, 5);
    }

    @Test
    public void subset_oneNeg_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(1, 2, 5, -7, 2, 3));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).containsExactly(1, 2, 5);
    }

    @Test
    public void subset_twoNeg_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(1, 2, 5, -7, -1, 2, 3));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).containsExactly(1, 2, 5);
    }

    @Test
    public void subset_allNeg_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(-1, -2, -5, -7, -1, -2, -3));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).isEmpty();
    }

    @Test
    public void subset_oneElem_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(1));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).containsExactly(1);
    }

    @Test
    public void subset_oneNegElem_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(-1));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).isEmpty();
    }

    @Test
    public void subset_bigNumbers_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(1967513926, 1540383426, -1303455736, -521595368));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).containsExactly(1967513926, 1540383426);
    }

    @Test
    public void subset_longArray_returnsCorrectArray() {
        ArrayList<Integer> input = new ArrayList<>(asList(24831, 53057, 19790, -10679, 77006, -36098, 75319, -45223, -56760, -86126, -29506, 76770, 29094, 87844, 40534, -15394, 18738, 59590, -45159, -64947, 7217, -55539, 42385, -94885, 82420, -31968, -99915, 63534, -96011, 24152, 77295));

        ArrayList<Integer> result = maxNonNegativeSubArray.maxset(input);

        assertThat(result).containsExactly(76770, 29094, 87844, 40534);
    }


}
