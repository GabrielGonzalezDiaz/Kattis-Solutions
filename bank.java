import java.util.ArrayList;
import java.util.Scanner;

class Person{
	
	int money;
	int time;
	public Person(int a, int b){
		money = a;
		time = b;
		}
	}

public class bank {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Person> pop = new ArrayList<Person>();
		
		int people = scan.nextInt();
		int timeLeft = scan.nextInt();
		
		for(int i=0; i < people; i++)
			pop.add(new Person(scan.nextInt(), scan.nextInt()));
		
		int money = 0;
		
		for(int i=timeLeft; i >=0; i--){
			int curr = -1;
			int ind = -1;
			
			for (int j = 0; j < pop.size(); j++)
				if (pop.get(j).time >= i)
					if (pop.get(j).money > curr)
						{
						curr = pop.get(j).money;
						ind = j;
						}
			if(ind != -1){
				money += pop.get(ind).money;
				pop.remove(ind);
				}
			}
		
		System.out.println(money);
		
		scan.close();

		}

	}