import java.util.ArrayList;
import java.util.Scanner;

public class symmetricorder {


	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int set = 1;
		
		while(scan.hasNext()){
			
			int times = scan.nextInt();
			scan.nextLine();
			
			if(times == 0) break;
			else{
				String[] list = new String[times];
				for(int i=0; i < times; i++)
				{
					list[i] = scan.next();
				}
			
				ArrayList<String> ans = new ArrayList<>();
				
				for(int i=list.length-1; i >= 0; i--){
					if(i % 2 == 1)
					{
						ans.add(list[i]);
					}
					else
					{
						ans.add(0,list[i]);
					}
				}
					
				System.out.println("Set " + set);
				for(int i=0; i < ans.size(); i++)
				{
					System.out.println(ans.get(i));
				}
				
			}
				
				
			set++;
				
		}
		
		scan.close();
	}

}
