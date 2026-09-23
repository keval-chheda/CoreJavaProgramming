package com.corejava.company.cognizant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Merges overlapping intervals, a common sorting and array interview problem.
 */
public final class MergeOverlappingIntervals {

    private MergeOverlappingIntervals() {
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int index = 1; index < intervals.length; index++) {
            if (intervals[index][0] <= end) {
                end = Math.max(end, intervals[index][1]);
            } else {
                merged.add(new int[] {start, end});
                start = intervals[index][0];
                end = intervals[index][1];
            }
        }
        merged.add(new int[] {start, end});
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {9, 12}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
