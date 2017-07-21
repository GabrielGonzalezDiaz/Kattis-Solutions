import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
      int cases = scan.nextInt();
      scan.nextLine();
      while(cases --> 0)
      {
        String line = scan.nextLine();
        String[] info = line.split(" ");
        String elegible = "null";
        if( Integer.valueOf(info[1].substring(0,info[1].indexOf("/"))) >= 2010 )
          elegible = "true";
        else if( Integer.valueOf(info[2].substring(0,info[2].indexOf("/"))) >= 1991 )
          elegible = "true";
        else
        {
            double d = Integer.valueOf(info[3]);
            if( d / 5.0 > 8.0)
                elegible = "false";
        }
        
        if(elegible.equals("true"))
          System.out.println(info[0] + " eligible");
        else if(elegible.equals("false"))
          System.out.println(info[0] + " ineligible");
        else if(elegible.equals("null"))
          System.out.println(info[0] + " coach petitions");
      }
      
      scan.close();
      
  }
}