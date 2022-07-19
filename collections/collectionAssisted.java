package collections;

import java.util.*;

public class collectionAssisted {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> Hero=new ArrayList<String>();   
	      Hero.add("Vijay");//
	      Hero.add("Ajitj");    	   
	      System.out.println(Hero);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> a = new Vector();
	      a.addElement(400); 
	      a.addElement(0); 
	      System.out.println(a);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("ABD");  
	      names.add("XYZ");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(1);  
	       set.add(1);  
	       set.add(2);
	       set.add(4);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(1);  
	       set2.add(1);  
	       set2.add(2);
	       set2.add(4);	       
	       System.out.println(set2);
	      	} 
	      }  
	}


