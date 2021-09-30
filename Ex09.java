package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;

public class Ex09 {

	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\nicek\\Desktop\\iotest\\outtest8.txt";
		
		Writer wr = new FileWriter(file);
		
		//ABC~Z
		for(int i = 65; i<91; i++) {
			
			wr.write(i);
		}
		
//		for(char a = 'A' ; a<='Z'; a++) {
//			wr.write(a);
//		}
		wr.close();
		System.out.println("프로그램 종료");
	}
}
