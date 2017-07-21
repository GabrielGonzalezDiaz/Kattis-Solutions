import java.util.Scanner;

public class autori {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String ans = "";
		if(str.length() > 0)
			ans+= str.substring(0,1);
		
		for(int i=0; i < str.length()-1; i++)
		{
			if(str.charAt(i) == '-')
			{
				ans += str.substring(i+1, i+2);
			}
		}
		
		System.out.print(ans);
		
		scan.close();

	}

}
