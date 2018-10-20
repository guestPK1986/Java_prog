package ru.stqa.pft.sandbox;

import java.awt.*;

public class Point {

  public double x;
  public double y;
  private Event p2;
  private Event p1;


  public Point (double x, double y){
    this.x = x;
    this.y = y;

  }

  public double Distance() {

    //return Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - this.y1) * (this.y2 - this.y1));

    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));


  }
}







