package exception;

public class ArrayExceptionTest {
	
//	Unchecked Exception : 실행시점에 확인되는 예외로 예외처리를 하지 않아도 컴파일 됨
//	발생하면 수정해야 하는 에러이다.
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for(int i =0; i<=5; i++) {
			a[i] = i*10;
		}
		
	}

}
