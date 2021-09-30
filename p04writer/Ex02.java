package p18io.p03lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\nicek\\Desktop\\iotest\\outtest9.txt";
		Writer wr = new FileWriter(name);
		char[] datas = {'s','p','r','i','n','g'};
		char[] data2 = {'j','a','v','a'};
		
		wr.write(datas);
		wr.write(data2);
		wr.write(datas);
		wr.write(datas,2,4);
		
		wr.close();
		System.out.println("프로그램 종료");
	}
}
