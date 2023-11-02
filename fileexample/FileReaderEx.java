package fileexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fwriter=new FileWriter("D:/hello1.txt");
		String s="java full stack development";
		byte[] content = s.getBytes();
		fwriter.append(s);
		
		FileReader freader=new FileReader("D:/hello.txt");
		BufferedReader breader=new BufferedReader(freader);
		int records;
		while ((records=breader.read())!=-1) {
			System.out.print((char)records);
		}
		breader.close();
		freader.close();
		

	}

}
