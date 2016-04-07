import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;

public class WebPage
{
    public static void main(String[] args) throws IOException
    {
       
        
        String address = "http://www.naperville203.org/nnhs";
        URL pageLocation = new URL(address);
        Scanner in = new Scanner(pageLocation.openStream());
        PrintWriter out = new PrintWriter("webpage.txt");
        
        while (in.hasNext())
        {
            String s = in.next();
            out.print(s);
            
        }
        out.close();
    }
}