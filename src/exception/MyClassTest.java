package exception;

import java.io.IOException;

public class MyClassTest {
	
	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		try {
			myClass.dangerous();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
