import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class WordCounter
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int stringCount = 0;
        int charCount = 0;
        int lineCount = 0;
        File textFile = new File("51511-0.txt");
        Scanner in = new Scanner(textFile);
        in.useDelimiter("[^A-Za-z]");
        while (in.hasNext())
        {
            in.next();
            stringCount++;
        }
        
        textFile = new File("51511-0.txt");
        in = new Scanner(textFile);
        in.useDelimiter("");
        while (in.hasNext())
        {
            in.next().charAt(0);
            charCount++;
        }
        
        textFile = new File("51511-0.txt");
        in = new Scanner(textFile);
        
        while (in.hasNextLine())
        {
            in.nextLine();
            lineCount++;
        }
        
        in.close();
        
        System.out.println(stringCount);
        System.out.println(charCount);
        System.out.println(lineCount);
        
        
        
    }
    
}