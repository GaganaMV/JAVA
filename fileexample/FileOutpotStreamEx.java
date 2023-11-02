package fileexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutpotStreamEx {

	public static void main(String[] args) throws IOException {
		//write
		FileOutputStream fos=new FileOutputStream("D:/hello.txt");
		String s="java is object oriented programming language.oops conceps: inheritance, polymorphism,encapsulation,abstraction";
		byte b[]=s.getBytes();
		fos.write(b);
		
		System.out.println("content writen successfully!");
		
		
		//Read
		FileInputStream fis=new FileInputStream("D:hello.txt");
		System.out.println("file content");
		int read = fis.read();
		while (read != -1) {
			System.out.print((char)read);
			read=fis.read();
		}
		
		System.out.println(read);
		
		

	}

}
