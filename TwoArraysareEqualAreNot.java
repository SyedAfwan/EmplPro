package AllinOne;

import java.io.ObjectInputFilter.Status;
import java.util.Arrays;

public class TwoArraysareEqualAreNot {
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5,6};
		boolean status=true;
//		boolean status = Arrays.equals(a1, a2);
//		if(status==true) {
//			System.out.println("Arrays Are Equal");
//		}
//		else {
//			System.out.println("Arrays are not equal");
//		}
		if(a1.length == a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
			}
		}
		else {
			status=false;
			
		}
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
}
