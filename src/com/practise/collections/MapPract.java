package com.practise.collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class MapPract {

	//!!CHANGE!! should grab the number which appears an odd number of times; there is only one
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,1,1,1,1,10,1,1,1,1};
		
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		  
		   
	    for(int i = 0; i < A.length; i++){
	      if(hs.containsKey(A[i])){
	        hs.put(A[i],hs.get(A[i])+1);
	      }else{
	        hs.put(A[i],1);
	      }
	    }
	    
	    Set<Integer> entries = hs.keySet();
	    Iterator<Integer> it =  entries.iterator();
	    int number = 0;
	    int highest = 0;
	    while(it.hasNext()){
	    	int tmp = Integer.parseInt(it.next().toString());
	    	if(hs.get(tmp)%2!=0){
	    		System.out.println(tmp);
	    	}
	    }
	    

	}

}
