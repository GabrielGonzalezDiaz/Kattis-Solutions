import java.util.Scanner;

public class AlphabetSpam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		double capital = 0.0;
		double lower = 0.0;
		double white = 0.0;
		double others = 0.0;
		
		for(int i=0; i < str.length(); i++)
		{
			if(str.substring(i, i+1).equals("_")) white++;
			else if(str.substring(i, i+1).matches("[a-z]{1}")) lower++;
			else if(str.substring(i, i+1).matches("[A-Z]{1}")) capital++;
			else others++;	
		}
		
		System.out.println(white / ((double) str.length()));
		System.out.println(lower / ((double) str.length()));
		System.out.println(capital / ((double) str.length()));
		System.out.println(others / ((double) str.length()));

		scan.close();
		
	}

}
