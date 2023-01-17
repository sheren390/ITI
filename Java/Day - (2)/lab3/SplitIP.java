class SplitIP{
public static void main(String args[]) {
	String ip = "41.239.185.120";
	String arr[] = ip.split("\\.");
	
	for(int i=0 ; i < arr.length; i++) {
		System.out.println(arr[i]);
		 }
}
}
	
