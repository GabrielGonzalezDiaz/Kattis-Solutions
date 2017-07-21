import java.util.Scanner;

public class calculatingdartscores {

    public static String getString(int n)
    {
        if(n == 1)
            return "single";
        else if(n == 2)
            return "double";
        else 
            return "triple";
    }
    
    public static void printdart(int a, int b)
    {
    	if(b == 0)
    		return;
    	
    	if(b == 1)
    	{
    		System.out.println("single " + a);
    		return;
    	}
    	if(b==2)
    	{
    		System.out.println("double " + a);
    		return;
    	}
    	
    	System.out.println("triple " + a);
    		
    	
    }
    
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);
  
        int num = scan.nextInt();
        
        boolean found = false;
        
        loop : for(int atimes=1; atimes<=3; atimes++)
        {
        	for(int btimes=0; btimes<=3; btimes++)
            {
        		for(int ctimes=0; ctimes<=3; ctimes++)
                {
                	for(int a=1; a <= 20; a++)
                	{
                		for(int b=1; b <= 20; b++)
                    	{
                			for(int c=1; c <= 20; c++)
                        	{
                        		if(a*atimes + b*btimes + c*ctimes == num)
                        		{
                        			printdart(a,atimes);
                        			printdart(b,btimes);
                        			printdart(c,ctimes);
                        			found = true;
                        			break loop;
                        			
                        		}
                        	}
                    	}
                	}
                }
            }
        }

        if(!found)
        	System.out.println("impossible");
        
        scan.close();
        
    }

}
