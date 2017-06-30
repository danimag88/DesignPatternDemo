package builder_demo;

public class BuilderDemo {
	
	public static void main(String[] args) {
		User user = new User.Builder(1).name("john").age(10).build();
		System.out.println(user);
		new User.Builder(user).address("Bui Xuong Trach").gender("Nam").build();
		System.out.println(user);
	}

}
