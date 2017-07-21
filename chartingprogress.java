import java.util.ArrayList;
import java.util.Scanner;

public class chartingprogress {

	public static int numberofast(String str){
		
		int num = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == '*')
			{
				num++;
			}
		}
		
		return num;
		
	}
	
	public static void chart(ArrayList<String> lol)
	{
		
		int index = 0;
		for(int j=0; j < lol.size(); j++)
		{
		String s = lol.get(j);
		int len = s.length();
		int num = numberofast(s);
		String ans = "";
		for(int i=0; i < num; i++)
		{
			ans += "*";
		}
		
		for(int i=0; i < len - num - index; i++){
			ans = "." + ans;
		}
		
		for(int i=0; i < index; i++){
			ans += ".";
		}
		
		index += num;
		
		System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		while(scan.hasNextLine())
		{	
		list.add(scan.nextLine());
		}
		
		ArrayList<String> lines = new ArrayList<>(); 
		
		for(int i=0; i < list.size(); i++){
			if(i == list.size()-1)
			{
				lines.add(list.get(i));
				chart(lines);
				break;
			}
			else if(list.get(i).contains("*") || list.get(i).contains(".")){
				lines.add(list.get(i));
			}
			else
			{
				chart(lines);
				System.out.println();
				lines.clear();
			}
		}
		
		scan.close();
		
	}
}
