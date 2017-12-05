//package org.teachingkidsprogramming.section04mastery;
//
//import org.teachingextensions.logo.Tortoise;
//import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
//import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
//
//public class PentagonCrazy
//{
//  public static void main(String[] args)
//  {
//    Tortoise.show();
//    Tortoise.setSpeed(10);
//    //    createColorPalette (recipe below) --#8.1
//    //
//    //    ------------- Recipe for createColorPalette --#8.2
//    //    Add steel blue to the color wheel --#7
//    Tortoise.setPenColor(ColorWheel.addColor(PenColors.Blues.SteelBlue));
//    //    Add dark orchid to the color wheel --#11
//    //    Add dark slate blue to the color wheel --#12
//    //    Add teal to the color wheel --#13
//    //    Add indigo to the color wheel --#14
//    //    ------------- End of createColorPalette recipe --#8.3
//    //
//    //    drawPentagon (recipe below) --#10.1
//    //
//    //    ------------- Recipe for drawPentagon --#10.2
//    for (int i = 0; i < 200; i++)
//    {
//      //        adjustPen (recipe below) --#9.1
//      //
//      //        ------------- Recipe for adjustPen --#9.2
//      Tortoise.setPenColor(ColorWheel.getNextColor());
//      //        Increase the tortoises pen width by 1 --#15                                              
//      //        If the tortoise's pen width is greater than 4, then --#17
//      //            Reset the pen width to 1 --#16
//      //        ------------- End of adjustPen recipe --#9.3       
//      //
//      Tortoise.move(i++);
//      Tortoise.turn(360 / 5);
//      Tortoise.turn(1);
//    }
//    //    ------------- End of drawPentagon recipe --#10.3
//  }
//}
