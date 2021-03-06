package day29_collections;

import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args) {
		
		 //This is how to declare TreeMap 
	      TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

	      //put() adds elements to TreeMap
	      treeMap.put(1, "Mark");
	      treeMap.put(43, "Amanda");
	      treeMap.put(35, "John");
	      System.out.println(treeMap);
		
		   // remove(Object key) removes the key-value pair for the specified key
	       treeMap.remove(101);
	       System.out.println("After using remove(): " + treeMap);
	       
	       //get(Object key) returns the value for the specified key.
	       System.out.println(treeMap.get(102)); // Banu
	       
	       //containsKey(Object key): It is a boolean function which returns true or false 
	       //based on whether the specified key is found in the map.
	       System.out.println(treeMap.containsKey(100)); // true
	       System.out.println(treeMap.containsKey(101)); // false
	       
	       //isEmpty() is a boolean function which returns true or false 
	       //It checks whether the map is empty. 
	       System.out.println(treeMap.isEmpty()); // false
	       
	       //keySet()returns the Set of the keys fetched from the map.
	       System.out.println(treeMap.keySet()); //[100, 102]
	       
	       //values()returns a collection of values of map.
	       System.out.println(treeMap.values()); //[Mark, Banu]
	       
	       //size() Returns the size of the map
	       System.out.println(treeMap.size());// 2
	       
	       // clear() removes all the key and value pairs from the specified Map.
	       treeMap.clear();
	       System.out.println(treeMap); //{}
	}
}
