import java.util.Scanner;

public class timeloop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 int times = scan.nextInt();
		 
		 for(int i=0; i<times; i++){
			 System.out.println(i+1 + " " + "Abracadabra");
		 }
		 
		 scan.close();

	}

}
