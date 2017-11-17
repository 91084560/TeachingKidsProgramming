package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an Averb");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String currentEdVerb = MessageBox.askForTextInput("Enter an word that ends in ed");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part");
    String currentStory = "Today ";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    currentStory += "I woke " + currentAdverb + ".";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#
    currentStory += "Then I" + currentEdVerb + " ";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    MessageBox.showMessage(currentStory);
  }
}