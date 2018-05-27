package arrays.bucketingorsorting;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FindDuplicateInArrayTest {


    private final FindDuplicateInArray findDuplicateInArray = new FindDuplicateInArray();

    @Test
    public void repeatedNumber_n4_ok() {
        List<Integer> input = asList(3, 4, 1, 4, 1);
        List<Integer> duplicates = asList(4, 1);

        int result = findDuplicateInArray.repeatedNumber(input);

        assertThat(duplicates).contains(result);
    }

}
