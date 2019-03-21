/*
 * ITSW 2417 Chapter 8 Morse Code Converter Programming Challenge
 * MorseMain class
 * @author Gabby Schmitt
 * @version 1.0
 */
import java.io.*;
import java.util.Scanner;

public class MorseMain
{
    public static void main (String[] args) throws IOException
    {
        //Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Create Morse object
        Morse morse = new Morse();

        //Get input from user to convert to Morse code
        System.out.print("Enter the text you would like to convert to Morse code: ");
        String original = keyboard.nextLine();

        //Change user input to all caps
        original = original.toUpperCase();

        //Display the Morse code converted from user's text
        System.out.println("Converting '" + original + "' into Morse code:");
        System.out.println(morse.convertToMorse(original));

        //Set mCode equal to the Morse code output from the convertToMorse method
        String mCode = morse.convertToMorse(original);

        //Display the user's original text converted from Morse code
        System.out.println("Here is your original input: " + morse.convertToString(mCode));

    }
}