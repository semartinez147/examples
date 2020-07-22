package com.semartinez;

public class Arrays {

  /**
   *https://codingbat.com/prob/p189576
   * Consider the leftmost and righmost appearances of some value in an array. We'll say that the
   "span" is the number of elements between the two inclusive. A single value has a span of 1.
   Returns the largest span found in the given array. (Efficiency is not a priority.)
   */
  public int maxSpan(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int span = 1;
    int run = 1;

    for (int i = 0; i < nums.length - span; i++) {
      for (int j = nums.length - 1; j >= i + span; j--) {
        if (nums[i] == nums[j]) {
          run = j - i + 1;
        }
        if (run > span) {
          span = run;
        }
      }
    }

    return span;
  }

  /**
   * https://codingbat.com/prob/p158767
   * Given a non-empty array, return true if there is a place to split the array so that the sum of
   * the numbers on one side is equal to the sum of the numbers on the other side.
   */
  public boolean canBalance(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    if (sum == 0) {
      return true;
    } if (sum%2 != 0) {
      return false;
    }
    int leftSum = 0;
    for (int num : nums) {
      leftSum += num;
      if ((sum - leftSum) == leftSum) {
        return true;
      }
    }
    return false;
  }


}
