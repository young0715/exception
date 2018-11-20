package exception;

import java.io.IOException;

public class MyClass {
	
	public void dangerous() throws IOException{
		System.out.println(".....normal1");
		
		boolean isDanger = true;
		
//		예외상황 발생
		if(isDanger) {
			throw new IOException("예외상황발생");
		}
		
		//예외 발생하면 실행이 안됨. 
		System.out.println("......normal2");
	}
}
