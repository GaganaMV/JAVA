package fileexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx {

	public static void main(String[] args)  throws IOException{
		File newf=new File("C:/Users/ASUS/eclipse-workspace/corejava/src/exception/f.txt");
		if(newf.createNewFile()) {
			System.out.println("created");
		}else {
			System.out.println("exists");
		}
		
		File newfile1=new File("C:/Users/ASUS/eclipse-workspace/corejava/src/fileexample/ListOfCourse1.txt");
		if(newfile1.createNewFile()) {
			System.out.println("created");
		}else {
			System.out.println("exists");
		}
		System.out.println("name of file:"+newfile1.getName());
		System.out.println("absolute path:"+newfile1.getAbsolutePath());
		System.out.println("Relative Path:"+newfile1.getCanonicalPath());
		System.out.println(newfile1.canRead());
		File newFile=new File("ListOfCourse.txt");
		if(newFile.createNewFile()) {
			System.out.println("File created.");
		}else {
			System.out.println("file exists.");
		}
		
		File pdf=new File("C:/Users/ASUS/eclipse-workspace/corejava/src/fileexample/course.pdf");
		if(pdf.createNewFile()) {
			System.out.println("created");
		}else {
			System.out.println("exists");
		}
		
		File newFile3=new File("D:/core java/");
		String[] list=newFile3.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		File newFile4=new File("D:/core java/list.txt");
		if(newFile4.createNewFile()) {
			System.out.println("lists created");
		}else {
			System.out.println("exists");
		}
		
		File newFile5=new File("D:/core java/program.txt");
		if(newFile5.createNewFile()) {
			System.out.println("lists created");
		}else {
			System.out.println("exists");
		}
		
		
		
	}

}
