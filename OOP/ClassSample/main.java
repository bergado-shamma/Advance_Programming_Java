package Main;

public class main {
	//STATIC AND PUBLIC METHOD DECLARATION
//	static void myStaticMethod() {
//		System.out.println("Static Method Cast");
//	}
//	
//	public void myPublicMethod() {
//		System.out.println("Public Method Cast");
//	}
//	
//	public static void main(String[] args) {
//		myStaticMethod();
//		main myObj = new main();
//		myObj.myPublicMethod();
//	}
	
// another sample of METHOD
	
//	public void pressGas() {
//		System.out.println("The car is going fast");
//	}
//	
//	public void currentSpeed(int speed) {
//		System.out.println("The current speed is: "+ speed);
//	}
//	
//	public static void main(String[] args) {
//		main myCar = new main();
//		myCar.pressGas();
//		myCar.currentSpeed(100);
//		
//		main myRaceCar = new main();
//		myRaceCar.pressGas();
//		myRaceCar.currentSpeed(500);
//	}
	
	//Lesson: constructor
	
	int x; // create class attribute x
	
	public main(int value) { //this is the constructor
		
		x = value;
		
	}
	
	public static void main(String[] args) {
		main myObj = new main(3);
		System.out.println(myObj.x);
		
		main myObj2 = new main(5);
		System.out.println(myObj2.x);
	}

}
