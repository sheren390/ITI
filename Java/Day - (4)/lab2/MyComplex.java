import java.math.BigDecimal;

class Complex<T extends BigDecimal, R extends BigDecimal> {
	private T real;
	private R imag;
	
	Complex (T r, R i) {
		real = r;
		imag = i;
	}
	
	public void setRealImag(T r, R i){
		real = r;
		imag = i;
	}
	
	public T getReal(){
	return real;
	}

	public R getImag(){
	return imag;
	}
		
	public Complex<T, R> add(Complex<T,R> c) {
		return new Complex<T,R> ( (T) (real.add(c.real)), (R) (imag.add (c.imag)));
	}

	public Complex<T, R> subtract(Complex<T,R> c) {
		return new Complex<T,R> ( (T) (real.subtract(c.real)), (R) (imag.subtract (c.imag)));
	}
	public void print(){
	System.out.println(real + "+" + imag + "i");
	}
}

class MyComplex {

public static void main(String args[]) {

Complex comp1 = new Complex(new BigDecimal(2),new BigDecimal(3));
Complex comp2 = new Complex(new BigDecimal(8),new BigDecimal(4.5));
Complex comp3 = new Complex(new BigDecimal(6),new BigDecimal(6.5));
comp3 = comp1.add(comp2);
comp3.print();
}
}

