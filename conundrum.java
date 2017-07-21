import java.util.Scanner;

public class conundrum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String code = scan.next();
		
		String[] sen = new String[code.length()];
		
		for(int i=0; i < code.length(); i++)
		{
			sen[i] = code.substring(i,i+1);
		}
		
		int days = 0;
		
		for(int i=0; i < sen.length; i+=3)
		{
			if(!sen[i].equals("P")) days++;
		}
		
		for(int i=1; i < sen.length; i+=3)
		{
			if(!sen[i].equals("E")) days++;
		}
		
		for(int i=2; i < sen.length; i+=3)
		{
			if(!sen[i].equals("R")) days++;
		}
		
		System.out.print(days);
		
		scan.close();

	}

}
