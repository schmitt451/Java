/*
 * ITSW 2417 Chapter 8 Morse Code Converter Programming Challenge
 * Morse class
 * @author Gabby Schmitt
 * @version 1.0
 */
import java.io.*;
import java.util.Scanner;

public class Morse
{
    //Initialize constant and arrays
    public final static int NUM_CHARS = 40;
    private String[] regular = new String [NUM_CHARS];
    private String[] morse = new String [NUM_CHARS];

    //Morse constructor to read from morse.txt
    public Morse() throws IOException
    {
        //Open morse.txt
        File file = new File("morse.txt");
        Scanner inputFile = new Scanner(file);

        String line;
        int i = 0;

        //Loop to place corresponding strings in the correct array
        while (inputFile.hasNextLine() && i < regular.length)
        {
            line = inputFile.nextLine();
            regular[i] = line.substring(0,1);
            morse[i] = line.substring(2);
            i++;
        }

        //Close the file
        inputFile.close();

        //Add space character
        regular[i] = " ";
        morse[i] = " ";
    }

    //convertToMorse method returns a string of Morse code converted from text
    public String convertToMorse (String original)
    {
        String mCode = "";

        //Split user's input
        String[] tokens = original.split("");

        //Nested loops to find the corresponding Morse codes from the morse array
        for (int index = 0; index < tokens.length; index++)
        {
            for (int i = 0; i < regular.length; i++)
            {
                if (regular[i].equals(tokens[index]))
                {
                    mCode += morse[i] + "|";
                }
            }
        }
        return mCode;
    }

    //convertToString method returns the user's original input converted from mCode
    public String convertToString (String mCode)
    {
        String original = "";

        //Split mCode at the | symbols
        String[] tokens = mCode.split("[|]");

        //Nested loops to find the corresponding characters from the regular array
        for (int index = 0; index < tokens.length; index++)
        {
            for (int i = 0; i < morse.length; i++)
            {
                if (morse[i].equals(tokens[index]))
                {
                    original += regular[i];
                }
            }
        }
        return original;
    }
}
