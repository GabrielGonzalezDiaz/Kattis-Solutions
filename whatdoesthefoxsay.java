import java.util.ArrayList;
import java.util.Scanner;

public class whatdoesthefoxsay {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        scan.nextLine();
        while(times --> 0)
        {
            String[] s = scan.nextLine().split(" ");
            
            ArrayList<String> sounds = new ArrayList<String>();
            
            for(int i=0; i < s.length; i++)
            {
                sounds.add(s[i]);
            }
            
            while(scan.hasNext())
            {
                String lol = scan.nextLine();
                if(lol.endsWith("?"))
                    break;
                else
                {
                    ArrayList<String> rev = new ArrayList<String>();
                    rev.add(lol.split(" ")[2]);
                    sounds.removeAll(rev);
                }
            }
            
            for(String j : sounds)
                System.out.print(j + " ");
            
        }
        
        scan.close();
    }

}