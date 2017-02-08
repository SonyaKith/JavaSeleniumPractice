package JavaSeleniumExample;

import java.sql.SQLException;

public class ExceptionDemo {

	public static void main(String[] args) {
		Account acc = new Account();
		try {
			System.out.println("1st line");
			acc.withdraw(100);
			System.out.println("After trying the withdraw method");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Try again at some other point");
		}
		finally {
			System.out.println("Always executes");
		}
	}

}
