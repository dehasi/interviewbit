package arrays.primers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class ArrayBugTest {
    private final ArrayBug arrayBug = new ArrayBug();

    @Test
    public void test(){
        List<Integer> a = asList(1,2,3,4,5,6);
        int b = 1;

        List<Integer> result = arrayBug.rotateArray(a, b);

        Assertions.assertThat(result).containsExactly(2,3,4,5,6,1);
    }
}
