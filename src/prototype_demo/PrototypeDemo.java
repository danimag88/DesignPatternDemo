package prototype_demo;

public class PrototypeDemo {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("origin: "+user);
		User copy = new User.Copyist().copy(user);
		copy.setName("John");
		copy.setAge(11);
		System.out.println("origin: "+user);
		System.out.println("copy: "+copy);
	}

}
