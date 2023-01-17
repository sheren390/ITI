import java.util.ArrayList;
//import java.util.HashMap;
import java.util.*;

class AlphabetMap {
public static void main( String args[]) {

//List<String> words = new ArrayList(Arrays.asList("apple", "ball", "cat", "car", "dog", "doll"));
    Map<Character, ArrayList<String>> map = new HashMap<>();
	map.put('a',  new ArrayList<String>(Arrays.asList("apple","ana")));
	map.put('b',new ArrayList<String>(Arrays.asList( "ball")));
	map.put('c',new ArrayList<String>(Arrays.asList("cat","car")));
	map.put('d',new ArrayList<String>( Arrays.asList("dog","doll")));
	map.put('f', new ArrayList<String>(Arrays.asList("fan","five")));

	//System.out.println(map.get('f'));
	
	map.forEach((k,v) -> System.out.println(" key: "+ k + " ," + " values -> " + v));
}}

 