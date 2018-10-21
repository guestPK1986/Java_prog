package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class Distance_with_assertions_and_TestNG {

  private String[] args;

  @Test
  public static void main(String[] args) {
    Point p1 = new Point(7, 4);
    Point p2 = new Point(3, 4);

    double d = p1.Distance(p2);

    assert d == 4;

    if (true) {

      System.out.println("Assertion passed");
    } else {

      System.out.println("Assertion failed");
    }

    System.out.println("Distance between points is " + d);}


    @Test(alwaysRun = true)
    private void Test2(String[] args) {
      this.args = args;

      Point p1 = new Point(5, 3);
     Point p2 = new Point(2, 3);

      double d = p1.Distance(p2);

      assert d == 3.0;

      if (true) {

        System.out.println("Assertion passed");
      } else {

        System.out.println("Assertion failed");
      }

      System.out.println("Distance between points is ");

    }
  }