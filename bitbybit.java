import java.util.Scanner;

public class bitbybit {

	public static String and(String a, String b){
		if(a.equals("0") || a.equals("0"))
			return "0";
		if(a.equals("1") || b.equals("1"))
			return a.equals("1") ? b : a;
		return "?";
		}
	
	public static String or(String a, String b){
		if(a.equals("1") || a.equals("1"))
			return "1";
		if(a.equals("0") || b.equals("0"))
			return a.equals("0") ? b : a;
		return "?";
		}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		loop : while(scan.hasNextLine()){
			
			String[] bits = {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?", "?"};
			
			int commands = Integer.valueOf((scan.nextLine()));
			
			if(commands == 0)
				break loop;
			
			while(commands --> 0){
				String command = scan.next();
				if(command.equals("SET")){
					bits[scan.nextInt()] = "1";
					}
				else if(command.equals("CLEAR")){
					bits[scan.nextInt()] = "0";
					}
				else if(command.equals("AND")){
					int ind1 = scan.nextInt();
					int ind2 = scan.nextInt();
					bits[ind1] = and(bits[ind1],bits[ind2]);
					}
				else{
					int ind1 = scan.nextInt();
					int ind2 = scan.nextInt();
					bits[ind1] = or(bits[ind1],bits[ind2]);
					}
					
				
				}
			for(int i=31; i >= 0; i--)
				System.out.print(bits[i]);
			scan.nextLine();
			System.out.println();
			
			}
		
		scan.close();
		
		}

	}
