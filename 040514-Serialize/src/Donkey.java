import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Donkey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2177563950753505358L;
	
	/** the donkey's age */
	private int age = 0;
	
	/** the donkey's RSA private key 
	 *  transient as we really don't want to persist that, right? */
	private transient long rsaPrivateKey = 0xC0FFEE;
	
	/** */
	public Donkey(int age) {
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void serializeDonkey() {
		
		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/donkey.inc");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			
			// write the donkey to the disk
			outStream.writeObject(this);
			
			outStream.close();
			fileOut.close();
		} catch (IOException e) {
			System.err.println("Donkey could not be serialized. :-(");
		}
		
	}
}