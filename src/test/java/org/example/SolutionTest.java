package org.example;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void kClosestTest() {
        Solution solution = new Solution();
        int[][] inputOne = {{1, 3}, {-2, 2}};
        int[][] outputOne = {{-2, 2}};
        Assert.assertEquals(outputOne, solution.kClosest(inputOne, 1));
        int[][] inputTwo = {{3, 3}, {5, -1}, {-2, 4}};
        int[][] outputTwo = {{3, 3}, {-2, 4}};
        Assert.assertEquals(outputTwo, solution.kClosest(inputTwo, 2));
    }
}