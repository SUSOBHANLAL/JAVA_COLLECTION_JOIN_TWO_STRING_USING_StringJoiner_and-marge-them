package sstbuilde;
import java.util.*;
public class susobhanlal {
	public static void main(String args[]) {
		StringJoiner st1 = new StringJoiner(",","[","]");
		st1.add("A");
		st1.add("B");
		st1.add("C");
		
		StringJoiner st2 = new StringJoiner(":","(",")");
		st2.add("M");
		st2.add("N");
		
		System.out.print(st1+" ");
		System.out.println();
		System.out.print(st2+" ");
		System.out.println();
		
		st1.merge(st2);
		
		System.out.print(st1);
	}

}
