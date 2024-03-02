package AllinOne;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int a[]= {45,58,96,63};
		int b[]= {33,88,788,996,887};
		int ci=0;
		int []c= new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[ci]=a[i];
			ci++;
			
		}
		for(int j=0;j<b.length;j++) {
			c[ci]=b[j];
			ci++;
		}
		System.out.println(Arrays.toString(c));
		
	}

}
