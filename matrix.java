import java.util.*;

public class matrix
{
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);
    int test = 1;
    
    while(scan.hasNext())
    {
      System.out.println("case " + test + ":");
      test++;
      double a1 = scan.nextDouble();
      double a2 = scan.nextDouble();
      double a3 = scan.nextDouble();
      double a4 = scan.nextDouble();
      
      double det = a1*a4-a2*a3;
      
      if(det == 1)
      {
        System.out.println((int)a4 + " " + (int)-a2);
        System.out.println((int)-a3 + " " + (int)a1);
      }
      else
      {
        if(a1/det == (int) (a1/det))
          a1 = (int)(a1/det);
        if(a2/det == (int) (a2/det))
          a2 = (int)(a2/det);
        if(a3/det == (int) (a3/det))
          a3 = (int)(a3/det);
        if(a4/det == (int) (a4/det))
          a4 = (int)(a4/det);
          
        System.out.println((int)(a4) + " " + (int)(-a2));
        System.out.println((int)(-a3) + " " + (int)(a1));
      }
      
    }
    scan.close();
  }
}