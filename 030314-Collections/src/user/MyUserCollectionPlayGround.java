package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyUserCollectionPlayGround {
	
	Set<MyUser> hashSetMyUser = new HashSet<MyUser>();
	Set<MyUser> treeSetMyUser = new TreeSet<MyUser>();
	
	Map<Integer, MyUser> mapAgeUser = new HashMap<Integer, MyUser>();
	Map<String, MyUser> mapNameUser = new HashMap<String, MyUser>();

	@Before
	public void setUp() throws Exception {
		ArrayList<MyUser> userList = new ArrayList<MyUser>();
		userList.add(new MyUser("Paul", 21, 123456));
		userList.add(new MyUser("Paul", 23, 007007));
		userList.add(new MyUser("Emil", 21, 876543));
		userList.add(new MyUser("Adam", 24, 903273));
		
		for(MyUser iter : userList){
			hashSetMyUser.add(iter);
			hashSetMyUser.add(iter);
			treeSetMyUser.add(iter);
			
			// this is how we insert in a map
			mapAgeUser.put(iter.getAge(), iter);
			mapNameUser.put(iter.getName(), iter);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void printCollections() {
		// this is how we iterate through a set
		for(MyUser user : hashSetMyUser) {
			System.out.println("HashSet " + user.getName());
		}
		
		// ... or with an iterator
		Iterator<MyUser> setIter = treeSetMyUser.iterator();
		while (setIter.hasNext()) {
		  System.out.println(setIter.next());
		}
		
		// this is how we iterate through a map
		for(Map.Entry<Integer, MyUser> userEntry : mapAgeUser.entrySet()) {
			System.out.println("HashMap " + userEntry.getKey() + userEntry.getValue().getName());
		}
		
		// ... or with an iterator
		Iterator<Entry<String, MyUser>> mapIter = mapNameUser.entrySet().iterator();
		while (mapIter.hasNext()) {
			System.out.println(mapIter.next().getKey());
		}
	}
}
