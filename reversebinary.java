import java.util.Scanner;

public class reversebinary {

	public static String reverse(String s){
		int half = s.length() / 2;
		
		String[] word = new String[s.length()];
		
		for(int i=0; i < s.length(); i++)
		{
			word[i] = s.substring(i,i+1);
		}
		
		for(int i=0; i < half; i++)
		{
			String str = word[i];
			
			word[i] = word[word.length-i-1];
			word[word.length-i-1] = str;
		}
		
		String str = "";
		
		for(int i=0; i < word.length; i++){
			str += word[i];
		}
		
		return str;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		String numS = Integer.toBinaryString(num);
		
		String reversed = reverse(numS);
		
		int res = Integer.parseInt(reversed, 2);
		
		System.out.print(res);
		
		scan.close();
		

	}

}
