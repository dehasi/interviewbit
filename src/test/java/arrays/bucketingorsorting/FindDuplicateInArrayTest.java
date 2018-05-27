package arrays.bucketingorsorting;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FindDuplicateInArrayTest {


    private final FindDuplicateInArray findDuplicateInArray = new FindDuplicateInArray();

    @Test
    public void repeatetNumber_n4_ok() {
        assertThat(findDuplicateInArray.repeatedNumber(asList(3, 4, 1, 4, 1))).isEqualTo(1);
    }

}
