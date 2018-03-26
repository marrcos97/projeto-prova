class Parent{
	public Parent(){
		System.out.println("Pai");
	}

}
class Child extends Parent{

	public Child(){
		System.out.println("Filho 1");	
	}
	public Child(String s){
		this();
		System.out.println("Filho 2");	
	}

}
class A{
	public static void main(String[] args){
		Child child = new Child(" ");
	}
}