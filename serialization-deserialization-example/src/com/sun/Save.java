/**
 * 
 */
package com.sun;

import java.io.Serializable;

/**
 * @author SUN
 *
 */
public class Save implements Serializable{
	
	/*if you dont declare serialVersionUID default will be generated
		1. if you serialize a Obj and then Deserailize it - Works
		2. if you make the changes in Obj class like adding one more variable and deserialize it- not works because versionUID used during serialization not matched during deserialization
		3. Solutions: declare generated serialVesionUID inside serializable class
	*/
	private static final long serialVersionUID = 1402140817209880818L;
	//transient int i ; // transient keyword is used not to save particular data
	int i;
	String str;
	int age;
	String extra;
}
