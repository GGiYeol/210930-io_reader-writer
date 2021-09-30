package p18io.p03lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\nicek\\Desktop\\iotest\\outtest7.txt";
		Writer wr = new FileWriter(fileName);
		
		wr.write('a');
		wr.write('A');
		wr.write(65);
		wr.write('가');
		wr.write(4355);
		
		System.out.println("프로그램 종료");
		wr.close();
	}
	
}
