package example;

public class lambdas {
	
	public static void main(String[] args) {
		// my very first lambda expression in Java
		Runnable awesome = () -> System.out.println("I'm awesome <3");
		awesome.run();
	}
}