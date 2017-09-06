import java.util.Scanner;

class Main {
  //public static boolean 
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
    
    while(scan.hasNextLine())
    {
      String line = scan.nextLine().toLowerCase();
      if(line.contains("problem"))
        System.out.println("yes");
      else
        System.out.println("no");
    }  
    
    scan.close();
    
  }
}