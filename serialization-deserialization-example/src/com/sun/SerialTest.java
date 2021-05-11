/**
 * 
 */
package com.sun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.DefaultRowSorter;

/**
 * @author SUN
 *
 */
public class SerialTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Save obj = new Save();
		obj.i = 5;
		obj.str="Sunny";

		File f = new File("Obj.txt");
		//serialiazationObj(f,obj);
		deSerialiazationObj(f);

	}

	public static void serialiazationObj(File f, Save obj) throws IOException {
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("Obj is saved to the file...");
	}

	public static void deSerialiazationObj(File f) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj = (Save) ois.readObject();
		System.out.println("Read value is: "+obj.i+"----"+obj.str);
	}

}
