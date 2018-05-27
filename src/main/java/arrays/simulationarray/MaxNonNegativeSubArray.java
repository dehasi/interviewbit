package arrays.simulationarray;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        int curStart = 0, curFinish = 0;
        int resStart = -1, resFinish = -1;
        long curSum = 0L, resSum = -1L;
        int n = a.size();
        while (curFinish < n) {
            if (a.get(curFinish) >= 0) {
                curSum += a.get(curFinish);
                ++curFinish;
            } else {
                if (curSum > resSum) {
                    resSum = curSum;
                    resStart = curStart;
                    resFinish = curFinish;
                }
                curSum = 0;
                ++curFinish;
                curStart = curFinish;
            }
        }
        if (curSum > resSum) {
            resStart = curStart;
            resFinish = curFinish;
        }
        return new ArrayList<>(a.subList(resStart, resFinish));
    }
}
