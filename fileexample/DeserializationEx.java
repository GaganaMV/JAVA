package fileexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("serialEx.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		StudentEx s=null;
		StudentEx s1=null;
		StudentEx s2=null;
		s=(StudentEx) ois.readObject();
		s1=(StudentEx) ois.readObject();
		s2=(StudentEx) ois.readObject();
		s.display();
		s1.display();
		s2.display();
		
		ois.close();
		fis.close();

	}

}
