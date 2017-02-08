package JavaSeleniumExample;

import java.util.ArrayList;

import com.google.common.base.CaseFormat;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>(100); // defaults to array list of 10 elements - this list will have 100 elements

		// Adding
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Honda");
		
		// Size
		int size = cars.size();
		System.out.println("The size of the list is: " + size);
		
		// Get
		System.out.println("The item on index 1 is: " + cars.get(1));
		
		// Iteration
		for (int i = 0; i < size; i++) {
			System.out.println("The item on index " + i + " is: " + cars.get(i));
		}
		
		System.out.println("\nNext for loop example");
		for (String car: cars) {
			System.out.println("The item is: " + car);
		}
		
		// Remove 
		System.out.println("\nNext for loop example after removing");
		cars.remove(size - 1);
		for (String car: cars) {
			System.out.println("The item is: " + car);
		}
		
	}

}
