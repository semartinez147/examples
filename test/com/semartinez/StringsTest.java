package com.semartinez;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class StringsTest {

  Strings strings = new Strings();

  @ParameterizedTest
  @CsvFileSource(resources = "countyz-data.csv", numLinesToSkip = 1)
  void countYZ(String str, int result) {
    assertEquals(result, strings.countYZ(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "countyz-data.csv", numLinesToSkip = 1)
  void countYZRegex(String str, int result) {
    assertEquals(result, strings.countYZRegex(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "maxblock-data.csv", numLinesToSkip = 1)
  void maxBlock(String str, int result) {
    assertEquals(result,strings.maxBlock(str));
  }
}