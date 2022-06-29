package edu.epam.fop.lambdas;

import java.util.Comparator;

public final class RadianComparator {

  /*
   * Compares 2 angles (passed in radians). The angle counts from 0 up to 2π, the period must
   * be ignored, i.e. if angle is greater than 2π, then it must be converted to the range [0; 2π).
   * Precision must be 0.001 (delta), so if |a - b| < 0.001, then a == b.
   * 0 == 2π
   */
  public static Comparator<Double> get() {
    // TODO write your code here
    return null;
  }
}
