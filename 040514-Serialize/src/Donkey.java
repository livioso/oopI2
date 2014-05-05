import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Donkey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2177563950753505358L;
	
	/** the donkey's age */
	private int age = 0;
	
	@SuppressWarnings("unused")
	/** the donkey's RSA private key 
	 *  transient as we really don't want to persist that, right? */
	private transient long rsaPrivateKey = 0x00;
	
	public Donkey(int age, int rsaPrivateKey) {
		this.age = age;
		this.rsaPrivateKey = rsaPrivateKey;
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
	
	public void deserializeDonkey() {
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/donkey.inc");
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			
			// read the donkey from the disk
			Donkey deserializedDonkey = (Donkey) inStream.readObject();
			this.setAge(deserializedDonkey.getAge());
			
			inStream.close();
			fileIn.close();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Donkey could not be deserialized. :-(");
		}
	}
}