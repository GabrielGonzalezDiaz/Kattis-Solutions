import java.util.HashMap;
import java.util.Scanner;

public class AddingWords {
	
	public static int calc(String[] exp)
	{
		int ans = 0;
		ans += Integer.valueOf(exp[0]);
		for(int i=1; i < exp.length; i+=2)
		{
			if(exp[i].equals("+"))
			{
				ans += Integer.valueOf(exp[i+1]);
			}
			else
			{
				ans -= Integer.valueOf(exp[i+1]);
			}
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> vars = new HashMap<>();
		HashMap<Integer, String> nums = new HashMap<>();
		
		bigloop : while(scan.hasNextLine())
		{
			String line = scan.nextLine();
			
			if(line.startsWith( "def" ))
			{
				
				line = line.replaceAll("def ", "");
                
				String[] l = line.split(" ");
				String name = l[0];
				int val = Integer.valueOf(l[1]);
                
				nums.remove( vars.get(name) );
				vars.remove( name );
				
				vars.put( name, val );
				nums.put( val, name );
                  				
				/*
				String name = scan.next();
				int val = scan.nextInt();
				
				
				nums.remove( vars.get(name) );
				vars.remove( name );
				
				vars.put( name, val );
				nums.put( val, name );
				
				scan.nextLine();
				*/
				
			}
			
			else if(line.startsWith( "calc" ))
			{
				line = line.replaceAll("calc ", "");
				String expression = line.replaceAll(" =", "");
				String[] math = expression.split(" ");
				for(int i=0; i < math.length; i++)
				{
					if(!(math[i].equals( "-" ) || math[i].equals( "+" )))
					{
						if( !vars.containsKey( math[i]) )
						{
							System.out.println( line + " unknown" );
							continue bigloop;
						}
					}
				}
				
				String[] finalexpression = new String[math.length];
				
				for(int i=0; i < math.length; i++)
				{
					if((math[i].equals( "-" ) || math[i].equals( "+" )))
					{
						finalexpression[i] = math[i];
					}
					else
					{
						finalexpression[i] = vars.get(math[i]) + "";
					}
				}
				
				int ans = calc(finalexpression);
				
				String finalans = "unknown";
				
				if(nums.containsKey(ans))
					finalans = nums.get(ans);
				
				
				System.out.println(line + " " + finalans);
			
			}
			else if(line.equals("clear"))
			{
				vars.clear();
				nums.clear();
			}
		}
		
		scan.close();
		
	}
}


