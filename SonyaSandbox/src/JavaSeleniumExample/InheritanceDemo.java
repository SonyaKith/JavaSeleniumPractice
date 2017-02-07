package JavaSeleniumExample;

import Automobile.BMW;
import Automobile.Cars;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;

		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headsupDisplayNavigation();
		//c1.headsupDisplayNavigation(); Unable to call subclass method in parent object
		
	}

}
