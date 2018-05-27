package arrays.bucketing;

import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class NobleIntegerTest {
    private final NobleInteger nobleInteger = new NobleInteger();

    @Test
    public void solve_allPositives_findsSolution(){
        ArrayList<Integer> input = new ArrayList<>(asList(3,2,1,3));

        assertThat(nobleInteger.solve(input)).isEqualTo(1);
    }

    @Test
    public void solve_twoDigits_findsSolution(){
        ArrayList<Integer> input = new ArrayList<>(asList(2,1));

        assertThat(nobleInteger.solve(input)).isEqualTo(1);
    }

    @Test
    public void solve_oneNegative_findsSolution(){
        ArrayList<Integer> input = new ArrayList<>(asList(-2,1,1));

        assertThat(nobleInteger.solve(input)).isEqualTo(-1);
    }
    @Test
    public void solve_allNegativePlusZero_findsSolution(){
        ArrayList<Integer> input = new ArrayList<>(asList( -4, -2, 0, -1, -6 ));

        assertThat(nobleInteger.solve(input)).isEqualTo(1);
    }
}
