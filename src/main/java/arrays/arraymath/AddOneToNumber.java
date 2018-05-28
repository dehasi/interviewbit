package arrays.arraymath;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int shift = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > 0) break;
            ++shift;
        }
        ArrayList<Integer> result = new ArrayList<>(A.subList(shift, A.size()));

        int curry = 1;
        for (int i = result.size() - 1; i >= 0; --i) {
            int b = result.get(i) + curry;
            result.set(i, b % 10);
            curry = b / 10;
        }

        if (curry == 1) {
            ArrayList<Integer> result2 = new ArrayList<>(A.size() + 1);
            result2.add(1);
            result2.addAll(result);
            result = result2;
        }
        return result;
    }
}
