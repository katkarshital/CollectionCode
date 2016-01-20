package my.collection.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortedMap {
	public static void main(String[] args){
		/*Map<String,Integer> unsortedMap = new HashMap<String,Integer>();
		unsortedMap.put("Viraj",2);
		unsortedMap.put("Tanish",9);
		unsortedMap.put("Vikram", 39);
		unsortedMap.put("Shital", 35);
		unsortedMap.put("Shushila", 55);
		unsortedMap.put("Rajaram", 64);
		System.out.println("UnSorted Map -> ");
		printMap(unsortedMap);
		
		
		System.out.println("\nSorted Map in descending order......");
		Map<String,Integer> DescSortedMap = new TreeMap<String,Integer>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		DescSortedMap.putAll(unsortedMap);
		printMap(DescSortedMap);
		
		System.out.println("\nSorted Map in ascending order......");
		Map<String,Integer> AscSortedMap = new TreeMap<String,Integer>();			
					
			
		AscSortedMap.putAll(unsortedMap);
		printMap(AscSortedMap);*/
		Map<Employee,Double> unsortedMap = new HashMap<Employee,Double>();
		unsortedMap.put(new Employee(11,"Tanish","CA"), 12345.99);
		unsortedMap.put(new Employee(12,"Vikram","NY"), 23456.77);
		unsortedMap.put(new Employee(13,"Viraj","AZ"), 18945.22);
		unsortedMap.put(new Employee(14,"Shital","CA"), 23457.99);

		System.out.println("UnSorted Map -> ");
		printMap(unsortedMap);
		
		System.out.println("\nSorted Map in ascending order......");
		Map<Employee,Double> AscSortedMap = new TreeMap<Employee,Double>();			
		AscSortedMap.putAll(unsortedMap);
		printMap(AscSortedMap);
		
		System.out.println("\nSorted Map in descending order......");
		Map<Employee,Double> DescSortedMap = new TreeMap<Employee,Double>(new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.compareTo(o1);
			}
			
		});
		DescSortedMap.putAll(unsortedMap);
		printMap(DescSortedMap);
		
		
			
	}
	public static void printMap(Map<Employee,Double> map){
		for (Map.Entry<Employee,Double> entry : map.entrySet()) {
			System.out.println( entry.getKey() + "   :  " + entry.getValue());
		}
	}

}
