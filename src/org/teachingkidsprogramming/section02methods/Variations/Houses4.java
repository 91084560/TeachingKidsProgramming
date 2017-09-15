package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses4
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Amy");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Blues.DarkCyan);
    Tortoise.setPenWidth(8);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
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
}
