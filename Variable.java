package allJavaProgram;

public class Variable {

	// global static variable. calling from main method

	public static int a = 5;

	// global non-static variable. calling from main method
	public int b = 10;

	// calling global static variable inside a static method

	public static void m1() {
		System.out.println(a);
	}

	// calling static global variable inside non static method

	public void m2() {
		System.out.println(a);
	}
	// calling non-static global variable inside static method

	public static void m3() {
		Variable obj1 = new Variable();

		System.out.println(obj1.b);
	}

	// calling non-static global variable inside non-static method
	public void m4() {

		System.out.println(b);
	}

	// declaring local variable

	public void m5() {
		int x = 2;
		int y = 4;
		System.out.println(x);
		System.out.println(y);

		System.out.println(x + y);
	}

	// Calling global variable which consist of same name as
	// local variable

	public void m6() {

		int a = 20;
		System.out.println(Variable.a + " From method m6");
		System.out.println(a + " From method m6");

	}

	// Calling global non-static variable which consist of same name as
	// local variable

	public void m7() {

		int a = 20;
		int b = 30;
		Variable obj2 = new Variable();
		System.out.println(obj2.b + " from global non- static");
		System.out.println(Variable.a + " From method m7");
		System.out.println(b + " From method m7");

	}
	
	//Calling a non static variable inside a non static method using "this" keyword

	public void m8() {

		int b = 50;

		System.out.println(this.b + " from method m8");
		System.out.println(b + " from method m8");

	}

	public static void main(String[] args) {

		System.out.println(a);
		Variable obj = new Variable();
		System.out.println(obj.b);
		m1();
		obj.m2();
		m3();
		obj.m4();
		obj.m5();
		obj.m6();
		obj.m7();
		obj.m8();

	}

}
