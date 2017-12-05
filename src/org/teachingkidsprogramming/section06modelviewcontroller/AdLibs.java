package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an Averb");
    String currentEdVerb = MessageBox.askForTextInput("Enter an word that ends in ed");
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part");
    String currentStory = "Today ";
    currentStory += "I woke " + currentAdverb + ".";
    currentStory += "Then I " + currentEdVerb + " ";
    currentStory += "my " + currentBodyPart + ". ";
    MessageBox.showMessage(currentStory);
  }
}