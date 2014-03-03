package user;

public class MyUser implements IMyUser {
	
	private String name;
	private int age;
	private int matNumber;

	@Override
	public int compareTo(IMyUser o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setMatNumber(int matNumber) {
		this.matNumber = matNumber;
	}

	@Override
	public int getMatNumber() {
		return this.matNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d) has MatNumber %d", this.getName(), this.getAge(), this.getMatNumber()); 
	}

}
