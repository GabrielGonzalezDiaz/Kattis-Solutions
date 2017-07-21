import java.util.Scanner;

public class filip {

	public static String reverse(String s)
	{
		String l = "";
		for(int i=0; i < s.length(); i++)
		{
			l = s.substring(i, i+1) + l;
		}
		
		return l;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		a = reverse(a);
		b = reverse(b);
		
		int numa = Integer.valueOf(a);
		int numb = Integer.valueOf(b);
		
		if(numa > numb)
		{
			System.out.print(numa);
		}
		else
		{
			System.out.print(numb);
		}
		
		scan.close();

	}

}
