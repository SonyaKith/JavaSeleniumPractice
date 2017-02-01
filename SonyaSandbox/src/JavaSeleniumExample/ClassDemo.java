package JavaSeleniumExample;

public class ClassDemo {
	
	static String str2 = "Hi there!!!";
	
	/***
	 * [][][][[][CarObject - c1][CarObject - c2][][][][]
	 * @param args
	 */

	public static void main(String[] args) {

		String str1 = "Hello Java";
		
		System.out.println(str1);
		
//		for(int i=0; i < args.length; i++){
//			System.out.println(args[i]);
//			
		System.out.println("***************************************************");
		
		CarObject c1 = new CarObject();
		CarObject c2 = new CarObject();
		
//		c1.model = "BMW";
//		c1.year = 2015;
		
		System.out.println(c1.year);
		System.out.println(c1.getYear());
			
		
	}

}

class CarObject {
	
	int year = 2000;
	String model;
	
	public int getYear(){
		return this.year;
	}
	
}
