package ru.stqa.pft.sandbox;

import java.awt.*;

public class Point {

  public double x;
  public double y;
  private Event p2;
  private Event p1;
  private double x1;


  public Point (double x, double y){
    this.x = x;
    this.y = y;

  }

  public double Distance(Point p2) {

    return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));


  }
}







