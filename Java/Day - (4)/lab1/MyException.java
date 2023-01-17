import java.lang.Exception;

class IncorrectInputException extends Exception {

	public IncorrectInputException() {
		super(" this input is incorrect.");
	}
}
class ExceptionMethods {

void input(int a) throws IncorrectInputException {
	
	if (a<0) throw new IncorrectInputException();
	if (a>=0) a= 5;
}

public void fun_call(int a) throws IncorrectInputException{
	
	input(a);
}
public void main_call(int a) throws IncorrectInputException{

	fun_call(a);
}
}
class MyException {

public static void main (String args[]) {

	MyException t = new MyException();
	t.myFunction();
}
public void myFunction() {
	
	ExceptionMethods m = new ExceptionMethods();
	System.out.println("My function is running");
	try{
	m.main_call(-1);
	}
	catch (IncorrectInputException e) {
	e.printStackTrace();
	}
}
}

