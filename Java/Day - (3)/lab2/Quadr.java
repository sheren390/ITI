import java.util.function.Function;
import java.lang.Math;

class Getroots implements Function <Inputs , Roots> {
public Roots apply (Inputs var) {
	Roots r = new Roots();
	r.r1= ((var.b*(-1))+(Math.sqrt(var.b*var.b-4*var.a*var.c)))/2*var.a;
	r.r2= ((var.b*(-1))-(Math.sqrt(var.b*var.b-4*var.a*var.c)))/2*var.a;
	
	return r;
}}
class Inputs {
	public int a;
	public int b;
	public int c;
	public Inputs (int x , int y , int z){
	a=x;
	b=y;
	c=z;	
	}
}
class Roots {

	public double r1;
	public double r2;
	public Roots () {}
	public void print(){
	System.out.println(r1);
	System.out.println(r2);
	}
}

class Quadr {
public static void main (String args[]) {
Getroots root = new Getroots();
Roots R = new Roots();
Inputs input = new Inputs(6,-17,12);
R = root.apply(input);
R.print();
}}




