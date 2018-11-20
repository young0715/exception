package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOTest {
	
//	Checked Exception : 컴파일 할 때 확인 되는 예외로 예외처리가 필요함
//	InputStream is = new FileInputStream("1.txt"); 
//	이것만 사용할 경우 Unhandled exception type FileNotFoundException 에러 발생 가능함 
//	1.txt 파일이 있을지 확실하지 않게 때문에 반드시 exception 처리를 해야함. 
//	대부분 소켓 통신인 io 파일에는 꼭 해야함 
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("1.txt");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일이 없습니다.");
			return;
		} 
		finally {
			try {
//				nullpointException 발생 
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
