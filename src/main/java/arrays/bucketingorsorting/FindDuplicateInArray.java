package arrays.bucketingorsorting;

import java.util.List;

public class FindDuplicateInArray {
    public int repeatedNumber(final List<Integer> a) {
        int n = a.size() - 1;
        boolean[] hash = new boolean[n + 1];
        for (int i = 0; i < a.size(); i++) {
            int val = a.get(i);
            if (hash[val]) return val;
            hash[val] = true;
        }
        return -1;
    }
}
