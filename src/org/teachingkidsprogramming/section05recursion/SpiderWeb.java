package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double currentLength = 10.5;
    double currentZoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      currentLength = weaveOneLayer(currentLength, currentZoom);
      currentZoom = currentZoom * 1.3;
    }
  }
  private static double weaveOneLayer(double currentLength, double currentZoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(currentLength);
      Tortoise.turn(360 / 6);
      currentLength += currentZoom;
    }
    return currentLength;
  }
  private static void drawTriangle(double currentLength)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(currentLength);
      Tortoise.turn(360 / 3);
    }
  }
}
