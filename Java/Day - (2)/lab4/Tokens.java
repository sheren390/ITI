import java.util.StringTokenizer;

class Tokens{
public static void main(String args[]) {

	StringTokenizer sentense = new StringTokenizer("A friend in need is a friend indeed");
     	while (sentense.hasMoreTokens()) {
        	System.out.println(sentense.nextToken());
     }
}
}