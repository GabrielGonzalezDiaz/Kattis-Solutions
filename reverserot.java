import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverserot {

	
	public static String rotate(String str, int rot)
	{
		final String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		
		if(abc.indexOf(str) + rot < abc.length()) 
		{
			return abc.substring(abc.indexOf(str) + rot, abc.indexOf(str) + rot+1);
		}
		else
		{
			return abc.substring( ((abc.indexOf(str) + rot) % 28),  (abc.indexOf(str) + rot) % 28+1);
		}
		
	}
	
	public static String reverse(String str)
	{
		char[] word = str.toCharArray();
		
		ArrayList<String> almost = new ArrayList<>();
		
		
		
		for(char c: word)
		{
			almost.add(c + "");
		}
		
		Collections.reverse(almost);
		String ans = "";
		
		for(String a : almost)
		{
			ans += a;
		}
		
		
		return ans;
	}
	
	public static void main(String[] args)
	{
		
		
		Scanner scan = new Scanner(System.in);
	
		//System.out.println(rotate(".",1));
		
		while(true)
		{
		
			int rots = scan.nextInt();
			
			if(rots == 0)
			{
				break;
			}
			else
			{
				String str = scan.nextLine();
			
				str = reverse(str);
			
				String ans = "";
				
				for(int i=0; i < str.length(); i++)
				{
					ans += rotate(str.substring(i, i+1), rots);
				}
				
				System.out.println(ans.substring(0,ans.length()-1));
			}
		}
		
		scan.close();
		
	}
	

}


