import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static final double LIMIT = 50;

   public static void main(String[] args) throws FileNotFoundException
   {  
      Scanner in = new Scanner(new File("babyNames80s.txt"));
         
      RecordReader boys = new RecordReader(LIMIT);
      RecordReader girls = new RecordReader(LIMIT);
      Scanner scan = new Scanner(System.in);
      System.out.println("Total number of boys: ");
      int boy = scan.nextInt();
      System.out.println("Total number of girls: ");
      int girl = scan.nextInt();
      
      
      while (boys.hasMore() || girls.hasMore())
      {
         int rank = in.nextInt();
         System.out.print(rank + " ");
         boys.process(in, boy);
         girls.process(in, girl);
         System.out.println();
      }

      in.close();
   }
}	
