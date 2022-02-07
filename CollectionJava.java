package collectionjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class CollectionJava {
	
	
	void arrayListMethod()
	{
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("ab");
		arrList.add("ac");
		arrList.add("ad");
		arrList.add("ae");
		arrList.add("af");
		System.out.println("Array List :"+arrList);
		
		arrList.remove(3);
		System.out.println("Array List after arrList.remove(3):"+arrList);
		
		for(String element:arrList)
		{
			System.out.println("Traversing Array List : "+element);
		}
		
		System.out.println("Array List Size : "+arrList.size());
		
		Collections.sort(arrList);
						
		//arrList.sort();
	} // arrayListMethod()
	
	
	void linkedListMethod()
	{
		LinkedList<String> objLinkedList=new LinkedList<String>();
		
		objLinkedList.add("abc");
		objLinkedList.add("xyz");
		objLinkedList.add("qwe");
		objLinkedList.add("ery");
		objLinkedList.add("pwe");
		objLinkedList.add("ery");
		System.out.println("Linked List : "+objLinkedList);
		
		objLinkedList.remove("pwe");
		System.out.println("Linked List after objLinkedList.remove(\"pwe\") : "+objLinkedList);
		
		for(String element:objLinkedList)
		{
			System.out.println("LinkedList Traversing : "+element);
		}
		
		System.out.println("Linked List Size : "+objLinkedList.size());
		
		Collections.sort(objLinkedList);
		
		
	}// linkedListMethod()
	
	
	void hashMapMethod()
	{
		HashMap<Integer,String> objHashMap =new HashMap<Integer,String>();
		objHashMap.put(1,"one");
		objHashMap.put(2,"two");
		objHashMap.put(3,"three");
		objHashMap.put(4,"four");
		objHashMap.put(5,"five");
		
		System.out.println("HashMap element in pair key=value : "+objHashMap);
		
		objHashMap.remove(3);
		System.out.println("HashMap element after remove(3) : "+objHashMap);
		
		
		for(Map.Entry<Integer, String> entry : objHashMap.entrySet())
		{
			System.out.println("HashMap Traversing : "+entry.getKey()+"="+entry.getValue());
		}
		
		objHashMap.replace(1,"One-1");
		System.out.println("HashMap element after replace(1,\"One-1\") : "+objHashMap);
		
		
	}//hashMapMethod()
	
	
	
void hashTableMethod()
{
	Hashtable<Integer,String> objHashTable =new Hashtable<Integer,String>();
	
	objHashTable.put(1,"one");
	objHashTable.put(2,"two");
	objHashTable.put(3,"three");
	objHashTable.put(4,"four");
	objHashTable.put(5,"five");
	// objHashTable.put(null,"two"); not allow null
	
	System.out.println("HashTable elements in pair key=value : "+objHashTable);
	boolean b=objHashTable.contains("two");
	System.out.println("Is contain two value in hashtable : "+b);
	
	for(Map.Entry<Integer, String> entry : objHashTable.entrySet())
	{
		System.out.println("HashMap Traversing : "+entry.getKey()+"="+entry.getValue());
	}
	
	
}//hashTableMethod()


void treeMapMethod()
{
	TreeMap<Integer,String> objTreeMap=new TreeMap<Integer,String>();
	objTreeMap.put(1,"one");
	objTreeMap.put(2,"two");
	objTreeMap.put(3,"three");
	objTreeMap.put(4,"four");
	objTreeMap.put(5,"five");
	
	System.out.println("TreeMap elements in pair key=value : "+objTreeMap);
	
	for(Map.Entry<Integer, String> entry : objTreeMap.entrySet())
	{
		System.out.println("TreeMap Traversing : "+entry.getKey()+"="+entry.getValue());
	}
	
	
}//treeMapMethod()

void hashSetMethod()
{
	HashSet<String> objHashSet=new HashSet<String>();
	objHashSet.add("abc");
	objHashSet.add("abcg");
	objHashSet.add("abcr");
	objHashSet.add("abct");
	System.out.println("HashSet : "+objHashSet);
	
	objHashSet.remove("abc");
	
	for(String element:objHashSet)
	{
		System.out.println("HashSet Traversing :"+element);
	}
	
	System.out.println("HashSet Size : "+objHashSet.size());
	
}//hashSetMethod()

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericsDemo<Integer> obj=new GenericsDemo<>(100);
		int x=obj.getOb();
		System.out.println(x);
		
		
		GenericsDemo<String> obj1=new GenericsDemo<String>("Hello");
		String str=obj1.getOb();
		System.out.println(str);
		
		CollectionJava objCollectionJava=new CollectionJava();
		objCollectionJava.arrayListMethod();
		objCollectionJava.linkedListMethod();
		objCollectionJava.hashMapMethod();
		objCollectionJava.hashTableMethod();
		objCollectionJava.treeMapMethod();
		objCollectionJava.hashSetMethod();
		

	}// end main()

}// end CollectionJava


class GenericsDemo<T> //<> brackes indicates that the class is generic type
{
	/*
	 * Generics : 
	 * Provide type safety : ensuring that an operation is being performed on the right type of data before executing that operation
	 * 
	
	className <data type> referance_name= new className<data type>();
	
	Or
	
	className <data type> referance_name= new className<>();
	
	
	*/
	
	T ob;
	
	GenericsDemo(T o)
	{
		ob=o;
	} // end constructor
	
	
	public T getOb()
	{
		return ob;
	}
	
} // end GenericsDemo
