package oops;

public class Abstractpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI SBIobject = new SBI();
        SBIobject.ok();
        RBI ICICIobject = new ICICI();
        ICICIobject.ok();
        SBI SBIObject2 = new SBI();
        SBIObject2.add();
        
	}
}
 abstract class RBI{
	abstract void ok();

	 //abstract	void add();
	}

	class SBI extends RBI {
		void ok(){
			System.out.println("SBI abstaexample");
			}
	void	add(){
			System.out.print("sadar");
		}
	}
	class ICICI extends RBI  {
		void ok(){
			System.out.println("xicice emple");
		}
		
		
}