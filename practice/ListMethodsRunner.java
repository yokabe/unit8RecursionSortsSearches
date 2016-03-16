import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(9);
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.print(i);
         }
      }
      ArrayList<Integer> newtempList = reverseList(tempList);
      System.out.println("");
      for (Integer i : newtempList)
         {
            System.out.print(i);
         }
   }
   public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
       ArrayList<Integer> list = ListMethods.deepClone(tList); 
       if (tList.size() <= 1)
       {
          return list;
       }
       else
       {
           Integer tempInt = list.remove(0);
           list = ListMethodsRunner.reverseList(list);
           list.add(tempInt);
       }
       return list;
       
    }
}