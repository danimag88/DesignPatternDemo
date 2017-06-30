package prototype_demo;

public class User {
	private String name = "no name";
	private String address = "no address";
	private int age = -1;
	private String gender = "no gender";
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public static class Copyist implements prototype.Copyist<User>{

		@Override
		public User copy(User origin) {
			User user = new User();
			user.name = origin.name;
			user.address = origin.address;
			user.age = origin.age;
			user.gender = origin.gender;
			return user;
		}
		
	}
	
}
