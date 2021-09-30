package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex02BufferedReader {

	public static void main(String[] args) throws Exception{
		//BufferedReader
		
		String name = "C:\\Users\\nicek\\Desktop\\iotest\\outtestE.txt";
		Reader reader = new FileReader(name);
		BufferedReader br = new BufferedReader(reader);
		
		long start = System.currentTimeMillis();
		
		while(br.read() != -1) {//15646
			
		}
//		while(reader.read() != -1) {//53447 52358			
//		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		br.close();
		reader.close();
	}
}
