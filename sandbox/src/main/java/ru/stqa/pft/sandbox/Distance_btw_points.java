package ru.stqa.pft.sandbox;
import org.testng.annotations.Test;


public class Distance_btw_points {

  @Test
  public static void main(String[] args) {
    Point p1 = new Point(7, 4);
    Point p2 = new Point(3, 4);

    double d = p1.Distance(p2);

    System.out.println("Distance between points is " + d);

  }
}

