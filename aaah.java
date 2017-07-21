import java.util.Scanner;

public class aaah {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			String main = scan.next();
			String doc = scan.next();
			
			if(main.length() >= doc.length())
			{
				System.out.println("go");
			}else{
				System.out.print("no");
			}
		}
		
		scan.close();

	}

}
