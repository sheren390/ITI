import java.util.Random;

class MinMax {
public static void main(String args[]) {

	int[] random_arr = new int[1000];
	for(int i=0; i<1000 ; i++) {
		Random random = new Random();
		int random_no = random.nextInt();
		random_arr[i] = random_no;
	}
	//for(int i=0; i<random_arr.length; i++) {
	//System.out.print(random_arr[i]+" ");
	//}
	int min = random_arr[0];
	int max = random_arr[0];
	
	long time1 = System.nanoTime();

	for(int i=1; i<random_arr.length; i++) {
		if(min > random_arr[i])
			min = random_arr[i];
		if(max < random_arr[i])
			max = random_arr[i];	
	}

	long time2 = System.nanoTime();	
	long actual_time = time2 - time1;	

	System.out.println("Min = "+ min);
	System.out.println("Max = "+ max);
	System.out.println("time = "+ actual_time);

}
}