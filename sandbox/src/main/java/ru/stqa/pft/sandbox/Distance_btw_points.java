package ru.stqa.pft.sandbox;

public class Distance_btw_points{

  public static void main(String[] args) {
    Point p1 = new Point();
    p1.x1 = 7;
    p1.y1 = 3;

    Point p2 = new Point();
    p2.x2 = 5;
    p2.y2 = 4;

    System.out.println("Distance between points is " + distance(p1, p2));
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 - p1.y1));
  }
}