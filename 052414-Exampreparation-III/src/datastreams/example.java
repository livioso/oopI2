package datastreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class example {

	public static void main(String[] args) throws IOException {
		
		DataOutputStream outputStream = null;
		DataInputStream inputStream = null;
		
		try {
			outputStream = new DataOutputStream(
					new BufferedOutputStream(
					new FileOutputStream("/tmp/whatever")));
			
			inputStream = new DataInputStream(
					new BufferedInputStream(
					new FileInputStream("/tmp/whatever")));
			
			// check it out
			outputStream.writeInt(999);
			outputStream.writeBoolean(false);
			outputStream.writeInt(999);
			outputStream.writeBoolean(true);
			outputStream.flush();
			
			System.out.println(inputStream.readInt());
			System.out.println(inputStream.readBoolean());
			System.out.println(inputStream.readInt());
			System.out.println(inputStream.readBoolean());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			outputStream.close();
			inputStream.close();
		}
	}
}
