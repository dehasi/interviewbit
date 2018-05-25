package arrays.primers;

import java.util.ArrayList;
import java.util.List;

public class Arrays2D {
    List<List<Integer>> performOps(List<List<Integer>> A) {
        List<List<Integer>> B = new ArrayList<>(A.size());
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(j, A.get(i).get(A.get(i).size() - 1 - j));
            }
        }
        return B;
    }
}
