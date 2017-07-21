import java.util.Scanner;

public class hidden {

	public static boolean valid(String pass, String msg)
	{
		for(int i=0; i < msg.length() && pass.length() > 0; i++)
		{
			if(pass.contains(msg.substring(i, i+1)))
			{
				if(msg.substring(i, i+1).equals(pass.substring(0,1)))
				{
					pass = pass.substring(1);
				}
				else
				{
					return false;
				}
			}
		}
		
		return pass.length() == 0;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String pass = scan.next();
		String msg = scan.next();
		
		if(valid(pass, msg)) System.out.println("PASS");
		else System.out.println("FAIL");
		
		scan.close();

	}

}
