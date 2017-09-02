import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CD 
{

    public static int BS(ArrayList<Integer> nums, int target)
    {
        int max = nums.size();
        int min = -1;
        
        for(int i=0; i < Math.ceil(Math.log(nums.size()) / Math.log(2)); i++)
        {
            
            int index = (max + min) / 2;
            
            if(min + 1 == max) 
            {
                break;
            }
            if(nums.get(index) == target)
            {
                return index;
            }
            else if(nums.get(index) > target)
            {
                max = index;
            }
            else
            {
                min = index;
            }
        }
        
        return -1;
        
        
    }
    
    public static void main(String[] args)
    {

        Kattio scan = new Kattio(System.in);
        
        mainloop :while(scan.hasMoreTokens())
        {
            
            int ja = scan.getInt();
            int ji = scan.getInt();
            
            if(ja == 0 & ji == 0)
            {
                break mainloop;
            }
            
            TreeSet<Integer> jack = new TreeSet<>();
            ArrayList<Integer> jill = new ArrayList<>();
            
            for(int i=0; i < ja; i++)
            {
                jack.add(scan.getInt());    
            }
            
            for(int i=0; i < ji; i++)
            {
                jill.add(scan.getInt());    
            }
            
            int c = 0;
            
            
            for(int i=0; i < Math.min(jill.size(), jack.size()); i++)
            {
                if(jack.contains(jill.get(i)))c++;
            }
            
            
            
        
            
            System.out.println(c);

        }
        
        
    
    
    }

    
    

}   

