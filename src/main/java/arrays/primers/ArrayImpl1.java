package arrays.primers;

import java.util.ArrayList;
import java.util.List;

public class ArrayImpl1 {
    List<Integer> performOps(List<Integer> A) {
        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }
}
