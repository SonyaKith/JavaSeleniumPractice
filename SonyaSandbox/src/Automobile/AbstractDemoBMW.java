package Automobile;

public class AbstractDemoBMW extends AbstractCars {
	
	/*public static void main(String[] args){
		 AbstractCars c1 = new AbstractCars(); // Abstract classes can't be instaniated. They can be extended.
	*/
	
	public void setPrivateSpeed(int speed) {
		super.setPrivateSpeed(10);
	}
	
	/*public void engineStart() {
		super.engineStart();
		System.out.println("BMWs have keyless engine start");
	}*/
	
	@Override
	public void engineStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engine start");
	}
}
