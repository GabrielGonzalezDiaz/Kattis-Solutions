import java.util.ArrayList;
import java.util.Scanner;

public class simonsays {

    public static void main(String[] args) {
    
        ArrayList<String> list = new ArrayList<String>();
        
        Scanner scan = new Scanner(System.in);
        int commands = scan.nextInt();
        commands += 1; 
         for(int i=0; i < commands; i++){
             String s = scan.nextLine();
             list.add(s);        
         }
         for(int i=0; i < list.size(); i++){
             if(list.get(i).startsWith("Simon says")){
                 System.out.println(list.get(i).substring(11));
             }
         }
         
         scan.close();
         
         

    }

}
