class A{}

class B extends A{}

public class TesteCast {
	public static void main(String[] args){
		B b = (B) new A();
		//A a = new B();
	}
}