package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		/*
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(new File("E://JavaTest/b.txt")));
		User user=new User();
		user.setAge(10);
		user.setName("Ð¡½Ü");
		
		os.writeObject(user);
		
		os.close();
		*/
		
		ObjectInputStream is=new ObjectInputStream(new FileInputStream(new File("E://JavaTest/a.txt")));
		User user=(User)is.readObject();
		System.out.println(user);
		is.close();
		
	}
}
