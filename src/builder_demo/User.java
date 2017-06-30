package builder_demo;

import builder.AbstractBuilder;

public class User {
	
	private int id;
	private String name = "no name";
	private String address = "no address";
	private int age = -1;
	private String gender = "no gender";
	
	private User(){
		
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender
				+ "]";
	}



	public static class Builder extends AbstractBuilder<User>{
		
		public Builder(int id) {
			super();
			building.id = id;
		}
		
		public Builder(User user) {
			super(user);
		}

		public Builder name(String name){
			add(new Materials() {

				@Override
				public void execute() {
					building.name = name;
				}
			});
			return this;
		}
		
		public Builder address(String address){
			add(new Materials() {

				@Override
				public void execute() {
					building.address = address;
				}
			});
			return this;
		}
		
		public Builder age(int age){
			add(new Materials() {

				@Override
				public void execute() {
					building.age = age;
				}
			});
			return this;
		}
		
		public Builder gender(String gender){
			add(new Materials() {

				@Override
				public void execute() {
					building.gender = gender;
				}
			});
			return this;
		}

		@Override
		protected User createBuilding() {
			return new User();
		}
		
	}

}
