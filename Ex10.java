package p18io.p02quiz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\nicek\\Desktop\\iotest\\outtest9.txt";
		String des = "C:\\Users\\nicek\\Desktop\\iotest\\outtestB.txt";
					
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);

		//대상 파일의 내용이 원본 내용의 반대로 네개씩 끊어서
			
		char[] datas = new char[4];
		
		while((rd.read(datas))  != -1) {
			reverse(datas);
			wr.write(datas);
		}
		
		rd.close();
		wr.close();
		System.out.println("프로그램 종료");

	}
	private static void reverse(char[] datas) {
		int left = 0;
		int right = datas.length - 1;
		
		while(left<right) {
			char c = datas[left];
			datas[left] = datas[right];
			datas[right] = c;
			
			left++;
			right--;
		}
	}
}
