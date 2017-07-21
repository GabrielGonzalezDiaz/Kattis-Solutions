import java.util.Scanner;

public class rijeci {

	/*public static ArrayList<String> pressbutton(ArrayList<String> ab)
	{
		for(int i=0; i < ab.size(); i++)
		{
			if(ab.get(i).equals("B"))
			{
				ab.set(i, "AB");
			}
			else
			{
				ab.set(i, "B");
			}
		}
		
		String str = "";
		
		for(int i=0; i < ab.size(); i++)
		{
			str += ab.get(i);
		}
		
		ArrayList<String> ans = new ArrayList<String>(str.length());
		
		for(int i=0; i < str.length(); i++)
		{
			ans.add(str.substring(i, i+1));
		}
		
		return ans;
	}*/
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		int as = 0;
		int bs = 1;
		
		for(int i=0; i < times-1; i++)
		{
			int aa = as;
			as = bs;
			bs += aa;
		}
		
		System.out.println(as + " " + bs);
		
		scan.close();
		
	}

}
