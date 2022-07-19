package Map;
import java.util.*;
public class mapDemo {

	
		public static void main(String[] args) {
			// map
			
			//Hashmap
			HashMap<Integer,String> a=new HashMap<Integer,String>();      
		      a.put(1,"Elon");    
		      a.put(2,"Jeff");    
		      a.put(3,"Cook");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:a.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     //HashTable
		       
		      Hashtable<Integer,String> b=new Hashtable<Integer,String>();  
		      
		      b.put(4,"Dhoni");  
		      b.put(5,"Virat");  
		      b.put(6,"Raina");  
		     

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:b.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
		      //TreeMap
		      
		      TreeMap<Integer,String> m=new TreeMap<Integer,String>();    
		      m.put(8,"Surya");    
		      m.put(9,"Ashwin");    
		      m.put(10,"Rohit");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:m.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}

