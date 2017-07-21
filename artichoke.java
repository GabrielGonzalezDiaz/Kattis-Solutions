import java.util.Scanner;

public class artichoke {
	
	public static double gcd(double a , double b) {
		
		if (a == 0)
			return b;
		
		return gcd(b % a , a);	
	}

	public static double lcm(double a, double b){
	  	return a*b/gcd(a,b);
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		double p = scan.nextDouble();
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double n = scan.nextDouble();
		
		scan.close();
	
		double diff = 0.0;
		double max = p * ( Math.sin( a*1+b ) + Math.cos( c*1+d ) + 2 );
		for( double i=2; i <= lcm(a*i+b, c*i+d) * Math.PI + 1 && i <= n; i++ )
        {
            double val = p * ( Math.sin( a*i+b ) + Math.cos( c*i+d ) + 2 );
            if(max - val > diff)
            	diff = max - val;
            
            if(val > max)
            	max = val;
        }
		
		System.out.println(diff);
		
	}
	

}
