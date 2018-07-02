class TestCastStrange implements I1, I2{
   public void m1() { System.out.println("Hello"); }
   public static void main(String[] args){
      TestCastStrange tc = new TestCastStrange();
      ( (I1) tc).m1();
	  System.out.println(( (I2) tc).VALUE);
	  System.out.println(I2.VALUE);
   }
}
interface I1{
   int VALUE = 1;
   void m1();
   static String getId(){ return "1111"; }
}
interface I2{
   int VALUE = 2;
   void m1();
}
