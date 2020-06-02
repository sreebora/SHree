package polymorphism;

public class Calciprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci cal = new Calci();
//non return type without parameter 
		cal.add();
// non return type with parameter 
		cal.add(2, 3);
cal.add(2f,4f );
// return type without parameter 
		int a = cal.returnadd();
		System.out.println(a);
// return type with parameter
		int c = cal.returnadd(2, 3);
		System.out.println(c);

	}

}
