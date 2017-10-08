import java.util.Scanner;
import java.util.TreeSet;

public class engineeringenglish {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		TreeSet<String> words = new TreeSet<>();
		
		while(scan.hasNextLine())
			{
			String fin = "";
			String[] sent = scan.nextLine().toLowerCase().split(" ");
			for(int i=0; i < sent.length; i++)
				{
				if(words.contains(sent[i]))
					fin += ". ";
				else
					{
					fin += sent[i] + " ";
					words.add(sent[i]);
					}
				}
			System.out.println(fin.trim());
			
			}
		
		scan.close();

	}

}
