/**
 * ITSW 2417 Chapter 5 File Display
 * FileDisplayRun class
 * @author Gabby Schmitt
 * @version 1.0
 */
import java.util.Scanner;
import java.io.*;

public class FileDisplayRun
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        
        //Ask for the file name
        System.out.print("Enter the name of the file you wish to view: ");
        String fileNameIn = keyboard.nextLine();
        
        File file = new File(fileNameIn); 
        
        //Make sure the file exists
        if (file.exists()) 
        {
            //Create instance of the FileDisplay class
            FileDisplay fd = new FileDisplay(fileNameIn);
            
            while(true) 
            {
                //Ask user how they want the file displayed
                System.out.println("Enter 1 to display the file header (first 5 lines).");
                System.out.println("Enter 2 to display the entire contents of the file.");
                System.out.println("Enter 3 to display the contents of the file in a " + 
                                   "numbered list form.");
                System.out.println("Enter 4 to exit.");
                System.out.print("Which option do you choose? ");
                int opt = keyboard.nextInt();
                
                //Extra space for clarity
                System.out.println();
                
                //Display user's choice
                switch (opt) 
                {
                    case 1: fd.displayHead(); break;
                    case 2: fd.displayContents(); break;
                    case 3: fd.displayWithLineNumbers();break;
                    case 4: System.exit(0);
                }
            }
        } 
        else 
        {
            System.out.println("The file " + fileNameIn + " does not exist.");
        }
    }
}