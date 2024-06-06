package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PreguntaDoce {

	public static void main(String[] args) {
		int a=2;
		int b=~a;
		int c= a^b;
		boolean d=a < b & a>c++;
		System.out.println(d+ " "+c);
		boolean e = a>b && a>c++;
		System.out.println(e+" "+c);	
		
		
		List lst = new ArrayList();
		lst.add("e1");
		lst.add("e3");
		lst.add("e2");
		
		int x1= Collections.binarySearch(lst, "e3");
		System.out.println(x1);
		Collections.sort(lst);
		int x2=Collections.binarySearch(lst, "e3");
		System.out.println(x2);
		Collections.reverse(lst);
		int x3=Collections.binarySearch(lst, "e3");
		System.out.println(x3);
		
	}

}
