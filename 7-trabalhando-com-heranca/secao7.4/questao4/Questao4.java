interface Z{}
interface W{}
interface Y extends Z,W{}
class B{}
class C extends B implements Y{}
class D extends B implements Z,W{}
class E extends D implements Y{}
class A{
	public static void main(String[] args){
		System.out.println("Bora passar na prova!");
		Y y = (Y) new D();
	}
}