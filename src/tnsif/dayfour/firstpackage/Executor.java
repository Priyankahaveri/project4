package tnsif.dayfour.firstpackage;

public class Executor {

	public static void main(String[] args) {
	//accessing same pacakage class
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		
		b1.varDefault=11;
		b1.methodDefault();
		
		//private memeber cant accessible
		//b1.varPrivate=21;
		
		
		b1.varProtected=31;
		b1.methodProtected();
		
		//instance of operator
		System.out.println(b1 instanceof Base);//returns true

	}

}
