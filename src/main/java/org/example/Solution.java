package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        //initialize the priority queue with the distance equation
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0] * a[0] + a[1] * a[1]));
        //initialize the 2d array
        int[][] result = new int[K][2];

        //add points to the priority queue
        for (int[] point : points) {
            pq.offer(point);
        }

        //remove points from the priority queue and add them to the result
        for (int i = 0; i < K; i++) {
            result[i][0] = pq.peek()[0];
            result[i][1] = pq.remove()[1];
        }
        return result;
    }
}
