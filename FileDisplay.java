/**
 * ITSW 2417 Chapter 5 File Display
 * FileDisplay class
 * @author Gabby Schmitt
 * @version 1.0
 */
import java.util.Scanner;
import java.io.*;

public class FileDisplay
{
    private String fileName;
    
    //Constructor that takes the file name as an argument
    public FileDisplay(String fName) throws IOException
    {
        fileName = fName;
    }
    
    //displayHead method displays first 5 lines of the file
    public void displayHead() throws IOException
    {
        //Open the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        
        //Loop to print the first 5 lines from the file
        for (int count = 1; count <= 5; count++)
            {
                String line = inputFile.nextLine();
                System.out.println(line);
            }
            
        //Extra space for clarity
        System.out.println();
        
        //Close the file
        inputFile.close();
    }
    
    //displayContents method displays all contents of the file
    public void displayContents() throws IOException
    {
        //Open the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        
        //Loop to print all contents
        while (inputFile.hasNext())
            {
                String contents = inputFile.nextLine();
                System.out.println(contents);
            }
            
        //Extra space for clarity
        System.out.println();
        
        //Close the file
        inputFile.close();
    }
    
    //displayWithLineNumbers method that displays all contents of the file and numbers each line
    public void displayWithLineNumbers() throws IOException
    {
        //Open the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        
        //Initialize accumulator
        int count = 0;
        
        //Loop to print all lines in the file and number them
        while (inputFile.hasNext())
        {
            String contents = inputFile.nextLine();
            count++;
            System.out.println(count + ") " + contents);
        }
        
        //Extra space for clarity
        System.out.println();
        
        //Close the file
        inputFile.close();
    }
}
