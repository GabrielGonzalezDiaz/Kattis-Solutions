import java.util.*; 

public class mirror
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      for(int skrt = 0; skrt < times; skrt++)
      {
        
        int r = scan.nextInt();
        int c = scan.nextInt();
        char[][] img = new char[r][c];
        scan.nextLine();
        
        for(int i=0; i < r; i++)
        {
          img[i] = scan.nextLine().toCharArray();
        }
        
        char[][] sides = new char[r][c];
        char[][] upside = new char[r][c];
        
        for(int rr = 0; rr < r; rr++)
        {
          for(int cc = 0; cc < c; cc++)
          {
            sides[rr][cc] = img[r-rr-1][cc];
          }  
        }
        
        for(int rr = 0; rr < r; rr++)
        {
          for(int cc = 0; cc < c; cc++)
          {
            upside[rr][cc] = sides[rr][c-cc-1];
          }  
        }
        
        System.out.println("Test" + " " + (skrt+1));
        
        for(int rr = 0; rr < r; rr++)
        {
          for(int cc = 0; cc < c; cc++)
          {
            System.out.print(upside[rr][cc]);
          }  
          System.out.println();
        }
    }  
    scan.close();
  }
}