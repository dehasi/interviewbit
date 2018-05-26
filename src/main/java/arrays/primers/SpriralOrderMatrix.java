package arrays.primers;

import java.util.ArrayList;
import java.util.List;

public class SpriralOrderMatrix {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = Math.max(A.size() / 2, A.get(0).size()/2);
        for (int l = 0; l < n; l++) {
            result.addAll(cut(A, l));
        }
//        if(A.size() % 2 != 0) {
//            int x = n;
//            result.add(A.get(x).get(x));
//        }
        return result;
    }


    List<Integer> cut(final List<ArrayList<Integer>> matrix, int layer) {
        List<Integer> list = new ArrayList<>();
        int xWith = matrix.size()-1;
        int yHeight = matrix.size()-1;

        P p1 = new P(0+layer, 0 + layer);
        P p2 = new P(xWith-layer, 0 + layer);
        P p3 = new P(xWith-layer, yHeight - layer);
        P p4 = new P(0+layer, yHeight - layer);

        for (int x = p1.x; x < p2.x; x++) {
            int point = matrix.get(p1.y).get(x);
            list.add(point);
        }
        for (int y = p2.y; y < p3.y; y++) {
            int point = matrix.get(y).get(p2.x);
            list.add(point);
        }
        for (int x = p3.x; x > p4.x; x--) {
            int point = matrix.get(p3.y).get(x);
            list.add(point);
        }
        for (int y = p4.y; y > p1.y; y--) {
            int point = matrix.get(y).get(p4.x);
            list.add(point);
        }
        return list;
    }
    static class P {
        final int x;
        final int y;

        P(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return String.format("{x:%s, y:%s}", x, y);
        }
    }
}
