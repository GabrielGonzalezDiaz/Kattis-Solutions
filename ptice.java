import java.util.Scanner;


public class ptice {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int slen = scan.nextInt();
		
		String answers = scan.next();
		
		int a=0;
		int b=0;
		int c=0;
		
		String as = "ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABC";
		String bs = "BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABC";
		String cs = "CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABB";
		
		
		for(int i=0; i < slen; i++)
		{
			if(answers.charAt(i) == as.charAt(i)) a++;
			if(answers.charAt(i) == bs.charAt(i)) b++;
			if(answers.charAt(i) == cs.charAt(i)) c++;
		}
		
		int max = Math.max(a, Math.max(b, c));
		
		System.out.println(max);
		if(a == max) System.out.println("Adrian");
		if(b == max) System.out.println("Bruno");
		if(c == max) System.out.println("Goram");
		
		scan.close();
	}

}
