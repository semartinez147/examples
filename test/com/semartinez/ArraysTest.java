package com.semartinez;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ArraysTest {
  Arrays arrays = new Arrays();

  private static Stream<Arguments> maxSpan() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 1, 1, 3}, 4),
        Arguments.of(new int[]{1, 4, 2, 1, 4, 1, 4}, 6),
        Arguments.of(new int[]{1, 4, 2, 1, 4, 4, 4}, 6),
        Arguments.of(new int[]{3, 3, 3}, 3),
        Arguments.of(new int[]{3, 9, 9}, 2),
        Arguments.of(new int[]{1}, 1),
        Arguments.of(new int[]{}, 0)
    );
  }

  @ParameterizedTest
  @MethodSource
  void maxSpan(int[] nums, int result) {
    assertEquals(result, arrays.maxSpan(nums));
  }

  private static Stream<Arguments> canBalance() {
    return Stream.of(
      Arguments.of(new int[]{1, 1, 1, 2, 1}, true),
      Arguments.of(new int[]{2, 1, 1, 2, 1}, false),
      Arguments.of(new int[]{10, 10}, true),
      Arguments.of(new int[]{10, 0, 1, -1, 10}, true),
      Arguments.of(new int[]{1, 1, 1, 1, 4}, true),
      Arguments.of(new int[]{1, 2, 3, 1, 0, 2, 3}, true),
      Arguments.of(new int[]{1}, false)
    );
  }

  @ParameterizedTest
  @MethodSource
  void canBalance(int[] nums, boolean result) {
    assertEquals(result, arrays.canBalance(nums));
  }
}