package math.adhoc;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int A) {
        List<String> s = new ArrayList<>(A);
        for(int i = 1; i <=A; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) s.add("FizzBuzz");
            else if (i % 3 == 0) s.add("Fizz");
            else if (i % 5 == 0) s.add("Buzz");
            else s.add(Integer.toString(i));
        }
        return s;
    }
}
