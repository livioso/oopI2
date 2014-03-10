package socialnetwork;

public class Gesichtsbuch {
	public static void main(String [] args) { 
		Networker seppBlatter = new Networker("Sepp Blatter");
		Networker tonyBlair = new Networker("Tony Blair");
		Networker frankUnderwood = new Networker("Frank Underwood");
		
		seppBlatter.addFriend(tonyBlair);
		frankUnderwood.addFriend(seppBlatter);
		frankUnderwood.addFriend(tonyBlair);
		tonyBlair.addFriend(seppBlatter);
		
		frankUnderwood.addPost("I Like House of Cards Season 2");
		seppBlatter.addPost("Getting ready for the FIFA world cup 2014...");
		tonyBlair.addPost("Just chillin...");
	}
}
