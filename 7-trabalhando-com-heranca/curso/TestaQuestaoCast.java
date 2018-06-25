interface Z {}
interface W {}
interface Y extends Z, W {}
class B {}
class C extends B implements Y {}
class D extends B implements Z, W {}
class E extends C {}
class A {
  public static void main(String[] args) {
	  //(B) new D();
	  if(((B) new D()) instanceof D)
		  System.out.println("Cast");
    System.out.println(((B) (Z) (W)  new D()) instanceof D);
  }
}