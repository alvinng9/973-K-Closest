package org.example;

import java.util.Arrays;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (a, b) -> {
            return (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]);
        });
        int[][] result = new int[K][2];
        for (int i = 0; i < K; i++) {
            result[i][0] = points[i][0];
            result[i][1] = points[i][1];
        }
        return result;
    }
}
