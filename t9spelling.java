import java.util.Scanner;

public class t9spelling {

	public static String convert(String str){
		
		if(str.equals("a")) return "2 ";
		if(str.equals("b")) return "22 ";
		if(str.equals("c")) return "222 ";
		
		if(str.equals("d")) return "3 ";
		if(str.equals("e")) return "33 ";
		if(str.equals("f")) return "333 ";
		
		if(str.equals("g")) return "4 ";
		if(str.equals("h")) return "44 ";
		if(str.equals("i")) return "444 ";
		
		if(str.equals("j")) return "5 ";
		if(str.equals("k")) return "55 ";
		if(str.equals("l")) return "555 ";
		
		if(str.equals("m")) return "6 ";
		if(str.equals("n")) return "66 ";
		if(str.equals("o")) return "666 ";
		
		if(str.equals("p")) return "7 ";
		if(str.equals("q")) return "77 ";
		if(str.equals("r")) return "777 ";
		if(str.equals("s")) return "7777 ";
		
		if(str.equals("t")) return "8 ";
		if(str.equals("u")) return "88 ";
		if(str.equals("v")) return "888 ";
		
		if(str.equals("w")) return "9 ";
		if(str.equals("x")) return "99 ";
		if(str.equals("y")) return "999 ";
		if(str.equals("z")) return "9999 ";
		
		if(str.equals(" ")) return "0 ";
		
		else return "";
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		scan.nextLine();
		
		int cases = 1;
		
		while(times --> 0)
		{
			String ans = "";
			String msg = scan.nextLine();
			for(int i=0; i < msg.length(); i++)
			{
				ans += convert(msg.substring(i, i+1));
			}
			
			ans.trim();
			
			for(int i=0; i < ans.length()-2; i++)
			{
				if(ans.charAt(i) != ans.charAt(i+2) && ans.charAt(i+1) == ' ')
				{
					ans = ans.substring(0, i+1) + ans.substring(i+2);
					i--;
				}
			}
			
			System.out.println("Case #" + cases + ": " + ans);
			cases++;
		}
		
		scan.close();
			
	}
		

}


