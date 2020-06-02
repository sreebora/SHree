package polymorphism;

public class Jntu20overriding extends Jntu19overirding{

	int i = 10;
	
	void ok(){
		System.out.println("this is jntu20 overiding");
		System.out.println(this.i+super.i);
	}
	
}
