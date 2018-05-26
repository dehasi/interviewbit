package arrays.primers;

import java.util.ArrayList;
import java.util.List;

public class SpriralOrderMatrix {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> matrix) {
        if (matrix.size() == 1) return matrix.get(0);
        ArrayList<Integer> result = new ArrayList<>(matrix.get(0).size() * matrix.size());

        int t = 0;
        int b = matrix.size() - 1;
        int l = 0;
        int r = matrix.get(0).size() - 1;

        int dir = 0;

        while (t <= b && l <= r) {
            if (dir == 0) {
                for (int i = l; i <= r; i++) result.add(matrix.get(t).get(i));
                ++t;
                dir = 1;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++) result.add(matrix.get(i).get(r));
                --r;
                dir = 2;
            } else if (dir == 2) {
                for (int i = r; i >= l; --i) result.add(matrix.get(b).get(i));
                --b;
                dir = 3;
            } else {
                for (int i = b; i >= t; --i) result.add(matrix.get(i).get(l));
                ++l;
                dir = 0;
            }
        }

        return result;
    }

}
