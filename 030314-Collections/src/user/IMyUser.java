package user;

public interface IMyUser extends Comparable<IMyUser> {
	public void setName(String name);
	public String getName();
	public void setAge(int age);
	public int getAge();
	public void setMatNumber(int matNumber);
	public int getMatNumber();
}
