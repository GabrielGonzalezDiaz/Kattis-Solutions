import java.util.Scanner;

public class erase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		String deleted = scan.nextLine();
		
		if(n % 2 == 0)
		{
			if(str.equals(deleted)) System.out.println("Deletion succeeded");
			else System.out.println("Deletion failed");
		}
		else
		{
			String newstr = "";
			for(int i=0; i < str.length(); i++)
			{
				if(str.substring(i, i+1).equals("1")) newstr += "0";
				else newstr += "1";
			}
			
			//System.out.println(newstr);
			
			if(newstr.equals(deleted)) System.out.println("Deletion succeeded");
			else System.out.println("Deletion failed");
		}
		
		scan.close();
		
	}

}
