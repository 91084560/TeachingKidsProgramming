package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow3
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    //int answer = 40;
    //    int answer = (int) (Math.random() * 100 + 1);
    int upperRange = MessageBox.askForNumericalInput("Enter a number for the upper range.");
    Random rand = new Random();
    int answer = rand.nextInt(upperRange) + 1;
    int lives = MessageBox.askForNumericalInput("How many Guesses");
    for (int i = 1; i <= lives; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      while (guess < 1 || guess > upperRange)
      {
        MessageBox.showMessage("Please enter a valid guess between 1 and " + upperRange);
        guess = MessageBox.askForNumericalInput("What is your guess?");
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high. You have " + (lives - i) + " guesses left.");
        //        System.out.println("You have "+ (lives - i) + " guesses left");
      }
      else
      {
        MessageBox.showMessage("Too low. You have " + (lives - i) + " guesses left.");
        //        System.out.println("You have "+ (lives - i) + " guesses left");
      }
      if (i == lives)
      {
        MessageBox.showMessage("You lost");
        System.out.println(answer);
      }
    }
  }
}
