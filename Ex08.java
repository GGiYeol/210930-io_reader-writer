package p18io.p02quiz;

import java.io.FileReader;

public class Ex08 {

	public String split(int num) throws Exception {
		String won = "C:\\Users\\nicek\\Desktop\\iotest\\test4.txt";
		FileReader re = new FileReader(won);
		char[] su = new char[num];
		String a = "";
		int cnt = 0;
		
		while((cnt = re.read(su)) != -1) {
			
				a += new String(su ,0, cnt) + ",";
			
		}
		re.close();
		
		
		return a.substring(0, a.length()-1);
	}
}
