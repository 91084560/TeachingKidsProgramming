package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses6
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Amy");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(0);
    int height = 40;
    drawHouseSlanted(height);
    drawHouseFlat(80);
    drawHouseTrapezoid(120);
    drawHouseParalellogram(72);
    drawHousePointy(180);
    drawHouseParalellogram(198);
    drawHouseParalellogram(10);
    drawHouseSlanted(90);
    drawHouseTrapezoid(20);
    drawHouseParalellogram(100);
    drawHousePointy(50);
    drawHouseTrapezoid(78);
    drawHouseParalellogram(55);
    drawHouseSlanted(190);
    drawHouseFlat(20);
    drawHousePointy(height);
    drawHouseSlanted(100);
    drawHouseTrapezoid(78);
    drawHousePointy(height);
  }
  private static void drawHouseFlat(int height)
  {
    Tortoise.setPenColor(PenColors.Purples.BlueViolet);
    Tortoise.setPenWidth(2);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseParalellogram(int height)
  {
    Tortoise.setPenColor(PenColors.Blues.MidnightBlue);
    Tortoise.setPenWidth(2);
    Tortoise.move(height);
    drawParalellagramRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlanted(int height)
  {
    Tortoise.setPenColor(PenColors.Greens.DarkSeaGreen);
    Tortoise.setPenWidth(3);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseTrapezoid(int height)
  {
    Tortoise.setPenColor(PenColors.Blues.DarkCyan);
    Tortoise.setPenWidth(5);
    Tortoise.move(height);
    drawTrapezoidRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointy(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.setPenWidth(3);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void drawSlantedRoof()
  {
    int a = 15;
    Tortoise.move(a);
    int c = 21;
    Tortoise.turn(135);
    Tortoise.move(c);
    Tortoise.turn(45);
  }
  private static void drawTrapezoidRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawParalellagramRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(135);
    Tortoise.move(10);
    Tortoise.turn(-45);
  }
}
