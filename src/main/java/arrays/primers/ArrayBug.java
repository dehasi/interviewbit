package arrays.primers;

import java.util.ArrayList;
import java.util.List;

public class ArrayBug {
    public List<Integer> rotateArray(List<Integer> A, int B) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int shiftedIndex = (i + B) % A.size();
            ret.add(A.get(shiftedIndex));
        }
        return ret;
    }
}
