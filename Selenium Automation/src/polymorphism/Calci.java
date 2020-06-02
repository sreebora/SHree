package polymorphism;

public class Calci {

	void add() {
		int a;
		int b;
		int d;
		a = 2;
		b = 3;
		d = a + b;
		System.out.println(d);

	}

	void add(int a, int b) {
		int t = a + b;
		System.out.println(t);
	}
	
	void add(float a, float b) {
		float t = a+b;
		System.out.println(t);
	}

	int returnadd() {

		int a;
		int b;
		int d;
		a = 2;
		b = 3;
		d = a + b;
        return d ;
	}

	int returnadd(int a ,int b) {
		int t = a+b;
		return t;
		
	}
	
	
}


