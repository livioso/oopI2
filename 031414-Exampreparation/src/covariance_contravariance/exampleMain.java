package covariance_contravariance;

import java.util.ArrayList;

/**
 *  Example: Source https://stackoverflow.com/questions/2501023/
 *  
 *  List<String> aList...
 *  List<? extends Object> covariantList = aList;
 *  List<? super String> contravariantList = aList;
 * 
 * >>> You can now access all methods of covariantList 
 * that doesn't take a generic parameter (as it must be 
 * something "extends Object"), but getters will work fine 
 * (as the returned object will always be of type "Object")
 * 
 * >>> The opposite is true for contravariantList: 
 * You can access all methods with generic parameters 
 * (you know it must be a superclass of "String", 
 * so you can always pass one), but no getters 
 * (The returned type may be of any other super type of String)
 * 
 * 
 * Or in other words:
 * 			
 *                     Read    Write
 *    Box<?>           No      No
 *    Box<? extends A> Yes     No    // note: Box<? extends B> box = new Box<B>(); is valid!
 *    Box<? super B>   No      Yes   // note: Box<? super B> box = new Box<B>(); is valid!
 * 
 */
public class exampleMain {

	public static void main(String[] args) {
		
		ArrayList<Object> example01 = new ArrayList<Object>(); 
		example01.add(new Racer());
		
		ArrayList<Racer> example02 = new ArrayList<Racer>(); 
		example02.add(new Racer());
		Object o = example02.get(0).getMeasurementInMs();
		
		ArrayList<?> example03 = new ArrayList<Racer>(); 
		// example03.add(new Racer()); >> not working
		
		ArrayList<? extends Sportsmen> example04 = new ArrayList<Racer>(); 
		// example04.add(new Racer()); 
		// ▲ we can not add as i could also point to a ArrayList<Icskater> (no write)
		// ▼ however we can be sure that there is something that extends a Sportsmen (read ok)
		Sportsmen test = example04.get(0);
		
		ArrayList<? super Racer> example05 = new ArrayList<Person>(); 
		example05.add(new Racer()); 
		// ▲ we can add as
		// ▼ however we can be sure what <? super Racer> is it could be Person or Sportsmen
		// Sportsmen test1 = example05.get(0);
	}

}
