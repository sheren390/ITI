class CountWord {
public static void main(String args[]) {
	String sen = "Hi world, Hi ITI, Hi for you";
	String word = "Hi";
	int count = 0;

	String arr[] = sen.split(" ");

	String arr2[] = sen.split("Hi");
	/*
	for(int i=0; i<arr2.length; i++) {
	System.out.println(arr2[i]+" ");
	} */
	System.out.print("using split: ");
	System.out.println(arr2.length-1);	

	//1st method
	for(int i=0 ; i < arr.length; i++) {
		if (word.equals(arr[i]))
			count++;
	}
	System.out.print("using equals: ");
	System.out.println(count);

	//2nd method
	int count2 = 0;
	for(int i=0 ; i < arr.length; i++) {
		if (arr[i].matches("Hi(.*)"))
			count2++;
	}
	System.out.print("using matches: ");
	System.out.println(count2);	

	//3rd method
	int index = 0;
	int count3 = 0;
	
	while(index >= 0 && index < sen.length()) {
	if ((sen.indexOf("Hi")!= -1) && (sen.indexOf("Hi")+2) < sen.length()){
	sen = sen.substring(sen.indexOf("Hi")+2);
	count3++;
	}
	else { break;}
	}
	System.out.print("using indexOf: ");
	System.out.println(count3);

		
}
}


