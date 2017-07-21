import java.util.ArrayList;
import java.util.Scanner;

public class modulo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] nums = new int[10];
        
        for(int i=0; i<10; i++){
            nums[i] = scan.nextInt();
        }
        
        ArrayList<Integer> mods = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            if(!mods.contains(nums[i] % 42)){
                mods.add(nums[i]%42);
            }
        }
        
        
        
        System.out.println(mods.size());
        
        scan.close();
    }

}