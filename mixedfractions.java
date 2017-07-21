import java.util.Scanner;

//import java.util.Scanner;


public class mixedfractions {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run){
		
		int num = scan.nextInt();
		int den = scan.nextInt();
		
		if(num == 0 && den == 0){
			run = false;
			break;
		}
		
		int whole = num / den;
		int newNum = num % den;
		
		System.out.println(whole + " " + newNum + " / " + den);
		
		}
		
		scan.close();
	}

}
