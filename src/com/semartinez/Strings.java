package com.semartinez;

public class Strings {

  /**
   * https://codingbat.com/prob/p199171
   * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the
   * 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
   * is at the end of a word if there is not an alphabetic letter immediately following it.
   */
  public int countYZ(String str) {
    int count = 0;

    for (int i = 0; i < str.length() - 1; i++) {
      if (Character.toLowerCase((str.charAt(i))) == 'y'
          || Character.toLowerCase((str.charAt(i))) == 'z') {
        if (!Character.isLetter(str.charAt(i + 1))) {
          count++;
        }
      }
    }
    if (Character.toLowerCase(str.charAt(str.length() - 1)) == 'y'
        || Character.toLowerCase(str.charAt(str.length() - 1)) == 'z') {
      count++;
    }

    return count;
  }

  public int countYZRegex(String str) {
    int count = 0;
    String[] words = str.split("[^a-zA-Z]+");
    for (String word : words) {
      if (!word.isEmpty() && word.substring(word.length() - 1).matches("[yzYZ]")) {
        count++;
      }
    }

    return count;
  }

  /**
   * https://codingbat.com/prob/p179479 Given a string, return the length of the largest "block" in
   * the string. A block is a run of adjacent chars that are the same.
   */
  public int maxBlock(String str) {
    if (str.length() == 0) {
      return 0;
    }

    int count = 1;
    int run = 1;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        run++;
        if (run > count) {
          count = run;
        }
      } else {
        run = 1;
      }
    }

    return count;
  }

}

