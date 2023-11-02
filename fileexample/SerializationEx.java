package fileexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		
		/*A marker interface in Java is an empty interface with no fields or methods. It has three types:

		Serializable interface

	    Cloneable interface

	    Remote interface*/
		
		StudentEx s=new StudentEx();
		s.id=1;
		s.name="tanuja";
		s.degree="BE";
		StudentEx s1=new StudentEx();
		s1.id=2;
		s1.name="trupti";
		s1.degree="bcom";
		StudentEx s2=new StudentEx();
		s2.id=3;
		s2.name="sahana";
		s2.degree="bsc";
		FileOutputStream fos=new FileOutputStream("serialEx.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.close();
		fos.close();
		System.out.println("data saved in the file");
		
	}

}
