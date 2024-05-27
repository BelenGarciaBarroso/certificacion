package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PruebasDeTodo {

	public static void main(String[] args) {
//		List<String> lst1=List.of("e","a","x");
//		Set<String> st1=new HashSet<>();
//		Map<String,String> mp=new HashMap<>();
//		Set<String> set2=Set.of(); //l1
//		st1.add(lst1.get(0)); //l2
//		mp.put(null,lst1.get(1));  //l3
//		//set2.add(lst1.get(2));  //l4 
//
//		List<Integer> l1=List.of(1,0,3,1);
//		Set<Integer> st=new HashSet(l1);
//		System.out.println(st.size());
		
//		var numA =new Integer[] {1, null, 3};
//		var list1= List.of(numA);
//		var list2=Collections.unmodifiableList(list1);
//		numA [1]=2;
//		System.out.println(list1+" "+list2);
		
//		List s1 = new ArrayList( );
//		s1.add("a");
//		s1.add("b");
//		s1.add("c");
//		s1.add("a");
//		if(s1.remove("a")){
//		    if(s1.remove("a")){
//		        s1.remove("b");
//		    }else{
//		        s1.remove("c");
//		    }
//		}
//		System.out.println(s1);
//		
//		int[] nums= {7,2,9,0};
//		Arrays.sort(nums);
//		for(int n:nums) {
//			System.out.println(n);
//		}
//		
//		List<Integer> lst=new ArrayList<> (List.of(4,11,2,5));
//		Collections.sort(lst);
//		System.out.println(lst);
		
		List<Integer> lst=new ArrayList<>(List.of(6,1,2,8));
		List<Integer> lst2=List.copyOf(lst);
		lst.sort((a,b)->b-a);
		System.out.println(lst.get(0)+":"+lst2.get(0));

	}

}
