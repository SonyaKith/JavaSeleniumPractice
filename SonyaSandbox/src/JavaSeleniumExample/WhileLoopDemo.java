package JavaSeleniumExample;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int i = 10; 
		
		//boolean condition = 10 < 20;
		//System.out.println(condition);
		
		while (i < 10) {
			//System.out.println(i);
			i++;
			if (i == 17) {
				continue;
			}
			System.out.println("Value of i: " + i);		
		}
		System.out.println("Outside loop...");
		
		do {
			System.out.println("Do while loop...");
			System.out.println(i);
			i++;
		}
		while (i < 10);
	
	}

}
