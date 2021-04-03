//this driver function is is used to test all the functions
public class ComplexRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numbers to test out
		Complex a = new Complex(7,4);
		Complex b = new Complex(23,-12);
		
		System.out.println("a= " + a.print());
		System.out.println("b= " + b.print());
		
		//calling the method to add 2 complex num
		a.addComplex(b);
		System.out.println("a+b= " + a.print());
		//calling the method to subtract 2 complex num
		a.setReal(7);
		a.setImag(4);
		a.subtractComplex(b);
		System.out.println("a-b= "+ a.print());
		//calling the method to multiply 2 complex num
		a.setReal(7);
		a.setImag(4);
		a.multiplyComplex(b);
		System.out.println("a*b= " + a.print());
       
	}

}
