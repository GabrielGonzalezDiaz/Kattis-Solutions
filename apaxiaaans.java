import java.util.Scanner;

public class apaxiaaans {

	public static String fix(String str){
		
		int len = str.length();
		
		if(len > 1 && str.substring(0,1).equals(str.substring(1,2))){
			return fix(str.substring(1));
		}
		
		for(int i=1; i<len-1; i++){
			if(str.substring(i,i+1).equals(str.substring(i+1,i+2))){
				return fix(str.substring(0,i) + str.substring(i+1));
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(fix(str));
		
		scan.close();

	}

}
