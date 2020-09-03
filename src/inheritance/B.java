package inheritance;

public class B extends A{
	int x = 20;
	 public void display() {
		 System.out.println(x);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		System.out.println(a.x);
		a.display();

	}

}
