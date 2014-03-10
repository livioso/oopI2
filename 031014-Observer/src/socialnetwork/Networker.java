package socialnetwork;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Networker extends Observable implements Observer {
	
	private String username = "undefined";
	private ArrayList<String> timelineposts = new ArrayList<>();
	
	public Networker (String username) {
		this.username = username;
	}
	
	public void addFriend(Networker friend) {
		addObserver(friend);
	}
	
	public void addPost(String post) {
		String newPost = username + " >> " + post;
		timelineposts.add(newPost);
	
		setChanged();
		notifyObservers(newPost + " new post on timeline of " + username);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
	}
}
