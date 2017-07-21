import java.util.Scanner;

public class sevenwonders {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		String struc = scan.nextLine();
		
		int t = 0;
		int c = 0;
		int g = 0;
		
		for(int i=0; i < struc.length(); i++)
		{
			if(struc.charAt(i) == 'T') t++;
			else if(struc.charAt(i) == 'C') c++;
			else g++;
		}
		
		int res = t*t + c*c + g*g;
		
		int sets = 0;
		
		while( t >= 1 && c >= 1 && g >= 1){
			sets++;
			t--;
			c--;
			g--;
		}
		
		res += sets * 7;
		
		System.out.print(res);
		
		scan.close();
	}

}
