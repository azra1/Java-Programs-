 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 /

public class ComplexNumbers {
	// Complete this class
	int real;
	int imag;
	ComplexNumbers(int real, int imag)
	{
	   real=this.real;
	   imag=this.imag;
	}
public void plus(Complex c)
	{
	    this.real=this.real+real;
	    this.imag=this.imag+imag;
	    
	}
public	void print()
	{
	    System.out.println(real+"+i"+imag);
	}
public void multiply(Complex c)
	{
	    this.real=this.real*real;
	    this.imag=this.imag*imag*(-1);
	}
	}
