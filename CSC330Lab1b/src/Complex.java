//this class does some mathematical functions related to complex numbers
public class Complex {
   private double real;
   private double imag;
   //two constructors
   //1. default constructor with no arguments
   //2. parameters initialize the instance variables
  
   public Complex () {
       real=0;
       imag=0;
   }

   public Complex(double realnum, double imagnum) {
       real=realnum;
       imag=imagnum;
   }
   //methods
   public void setReal(double newReal) {
       real= newReal;
   }
   public void setImag(double newImag) {
       imag=newImag;
   }
   public double getReal() {
       return real;
   }
   public double getImag() {
       return imag;
   }
   //method to add two complex numbers
   public void addComplex(Complex a ) {
	   real+=a.real;
	   imag+=a.imag;
   }
   //method to subtract two complex numbers
   public void subtractComplex(Complex b ) {
       real-=b.real;
       imag-=b.imag;
       
   }
   //method to multiply two complex numbers
   public void multiplyComplex(Complex c) {
       double tempReal= (real*c.real)-(imag * c.imag);
       imag= (real*c.imag)+(c.real*imag);
       real = tempReal;
  
   }
   //print method returns the appropriate string
   public String print() {
       if(imag==0) { //if the imaginary number=0, return the real num
           return real + "";
          
       }
       else if(real==0) { //if the real=0, then return the imag num
           return imag + "i";
          
       }
       else if(imag<0) { //if the imag is negative
           return real + " - " + (-imag) + "i";
       }
       else { //if any other cases
           return real + " + " + imag + "i";
       }
   }
}

