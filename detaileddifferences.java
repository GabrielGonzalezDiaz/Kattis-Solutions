import java.util.Scanner;

public class detaileddifferences {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		scan.nextLine();
		
		
		for(int u=0; u < times; u++)
		{
			
			String str = scan.nextLine();
			String str1 = scan.nextLine();
			
			String res = "";
			
			for(int i = 0; i < str.length(); i++)
			{
				if(str.charAt(i) == str1.charAt(i))
				{
					res += ".";
				}
				else
				{
					res += "*";
				}
			}
			
			System.out.println(str);
			System.out.println(str1);
			System.out.println(res);
			System.out.println();
			
		}
		
		scan.close();

	}

}
