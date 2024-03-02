package AllinOne;

import java.util.Arrays;

public class ReverseTheArrayUsingTemp {
	public static void main(String[] args) {
		int a[]= {1,2,5,8,9};
		int i=0, j=a.length-1,temp;
	   while(i>j) {
		   temp=a[i];
		   a[i]=a[j];
		   a[j]=temp;
		   i++;
		   j--;
	   }
		System.out.println(Arrays.toString(a));
	}

}
