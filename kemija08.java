import java.util.Scanner;

public class kemija08 {

	public static String decode(String str)
	{
		
		String[] sen = new String[str.length()];
		
		for(int i=0; i < str.length(); i++)
		{
			sen[i] = str.substring(i,i+1);
		}
		
		for(int i=0; i < sen.length-2; i++)
		{
			if(sen[i].equals("a") || sen[i].equals("e") || sen[i].equals("i") || sen[i].equals("o") || sen[i].equals("u"))
			{
				sen[i+1] = "*";
				sen[i+2] = "*";
			}
		}
		
		String res = "";
		
		for(int i=0; i < sen.length; i++)
		{
			if(!sen[i].equals("*")) res += sen[i];
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String sen = scan.nextLine();
		
		sen = decode(sen);
		
		System.out.print(sen);
		
		scan.close();
		
		
		
	}

}
