class B {
    int x() { return y();}
    int y() { 
	System.out.println("Passei no metodo do Pai");
	return 3; }
}
class C extends B {
    C() {
        super();
        z(x());
    }
    void z(int i) {
        System.out.println(i);
    }
    int y() {
		System.out.println("Passei no metodo do filho");
		return 2; }
}
class A {
    public static void main(String[] args) {
        new C();
    }
}