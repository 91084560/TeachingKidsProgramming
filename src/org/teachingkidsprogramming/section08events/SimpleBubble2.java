package org.teachingkidsprogramming.section08events;

import java.util.Random;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble2 implements MouseLeftClickListener
{
  ProgramWindow programWindow;
  public SimpleBubble2()
  {
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Purples.DarkSlateBlue);
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    ColorWheel.addColor(PenColors.Blues.CadetBlue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    //programWindow.clearWindow();
    Random rand = new Random();
    int radius = rand.nextInt(11) + 10;
    System.out.println(radius);
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    circle.setCenter(x, y);
    circle.addTo(programWindow);
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}