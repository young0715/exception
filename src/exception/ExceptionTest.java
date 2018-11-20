package exception;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		int a =0;
		int k = 0;
		try {
			k = 1000/a;
			System.out.println(k);
		}
		catch(ArithmeticException ex) {
			//1. 로그남기기(파일)
			
			//2. 사과(정상종료)
//			System.out.println("죄송합니다. 예기치 ...");
			
			//3.1,2번이라도 못하겠으면,
			ex.printStackTrace();
		}
		finally {
			// 예외가 발생하던지 정상적으로 프로그램이 실행되도 항상 실행되는 블록 
			
			// 공통적으로 실행되는 코드를 작성하게 된다.
			// 자원정리
		}
	}

}
