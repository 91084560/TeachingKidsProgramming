package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAsLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edVerb = askEdVerb();
    String bodyPart = askBodyPart();
    String chooseYourStory = "Today I woke " + adverb + ". Then I " + edVerb + " my " + bodyPart + ". ";
    System.out.println(chooseYourStory);
  }//end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Invalid Input! Try again.");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("You entered a number. Please enter what is asked.");
      askAdverb();
    }
    return adverb;
  }//end of method
  private static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("Enter a verb that ends with ed:");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Invalid Input! Try again.");
      askEdVerb();
    }
    else if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("You entered a number. Please enter what is asked.");
      askEdVerb();
    }
    return edVerb;
  }
  private static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part:");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Invalid input! Try again.");
      askBodyPart();
    }
    else if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("You entered a number. Please enter what is asked.");
      askBodyPart();
    }
    return bodyPart;
  }
}//end of class
