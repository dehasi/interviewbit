package arrays.bucketing;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public int solve(ArrayList<Integer> a) {
        Collections.sort(a);
        int n = a.size();
        if (a.get(n - 1) == 0) return 1;
        for (int i = 0; i < n; i++) {
            if (a.get(i) < 0) continue;
            if (a.get(i) == (n - 1 - i)) {
                if (i < n - 1) {
                    if (a.get(i) < a.get(i + 1)) return 1;
                }
            }
        }
        return -1;
    }
}
