package finalStatic;

class thing {

	public String name;
	public int age;
	public static String description;
	public final static int yearOfBirth = 1988; // this is constant because i declared it final it should have a value already
	
	public static void showInfo() {
		// this wont work because you are accessing instance properties thru static type method: System.out.println(age);
	}
	
	public void showInfo2() {
		System.out.println(description);
	}

}

public class App {

	public static void main(String[] args) {

		thing.description = "HI THERE ";
		// this wont work you cannot changed the constant final: thing.yearOfBirth = 200;
		thing thing1 = new thing();
		thing thing2 = new thing();

		thing1.name = "bob";
		thing1.age = 37;

		thing2.name = "john";
		thing2.age = 24;

		System.out.println(thing.description);
		System.out.println(thing1.name + " " + thing1.age);
		System.out.println(thing2.name + " " + thing2.age);
		thing1.showInfo2();

	}

}
