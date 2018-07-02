class A{
   public void m1() {System.out.println("Classe A");   }
}
class B extends A{
   public void m1() {System.out.println("Classe B");   }
}
class C extends B{
   public void m1(){ System.out.println("Classe C");  }
   public static void main(String [] args){
	   C c = new C();
	   A ac = new C();
	   c.m1();
	   c.m1();
   }
}
