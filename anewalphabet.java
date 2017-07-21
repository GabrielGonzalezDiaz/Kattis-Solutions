import java.util.Scanner;

public class anewalphabet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		String str = scan.nextLine();
		
		str = str.toLowerCase();
		
		String word = "abcdefghijklmnopqrstuvwxyz";
		
		String[] newAbc = {"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","`/","2"};
		
		String answer = "";
		
		for(int i=0; i < str.length(); i++){
			if(word.contains(str.substring(i, i+1)))
			{
				answer += newAbc[((int)str.charAt(i))-97];
			}
			else
			{
				answer += str.substring(i, i+1); 
			}
		}
		
		System.out.println(answer);
		scan.close();
		
		
/*
@
8
(				
|)
3
#
6
[-]
|
_|
|<
1
[]\/[]
[]\[]
0
|D
(,)
|Z
$
']['
|_|
\/
\/\/
}{
`/
2
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
