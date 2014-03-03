package user;

public class MyUser implements IMyUser {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyUser other = (MyUser) obj;
		if (age != other.age)
			return false;
		return true;
	}

	private String name;
	private int age;
	private int matNumber;

	@Override
	public int compareTo(IMyUser o) {
		int compareToResult = 0;
		if(this.getAge() > o.getAge()) {
			compareToResult = 1;
		}
		else if(this.getAge() < o.getAge()) {
			compareToResult = -1;
		}
		return compareToResult;
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
