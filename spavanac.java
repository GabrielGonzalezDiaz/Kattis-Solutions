import java.util.Scanner;

public class spavanac {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(m >= 45)
		{
			System.out.print((h + " ") + (m-45 + ""));
		}else{
			if(h == 0) h = 23;
			else h--;
			
			m = 45 - m;
			m = 60 - m;
			System.out.print((h + " ") + (m + ""));
		}

		scan.close();
		
	}

}
