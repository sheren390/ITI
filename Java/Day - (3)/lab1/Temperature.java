import java.util.function.Function;


class Convert implements Function<Double, Double> {

public Double apply (Double cel) {
	double f;
	f= (cel*(9.00/5.00) )+ 32.00;
  return f;
}

}
class Temperature {
public static void main (String args[]) {

Convert temp = new Convert();
double cel = 30.00;
double fer = 0;
fer = temp.apply(cel);
System.out.println(fer);

}}





