package AllinOne;

import java.util.Arrays;

public class MoveAllTheNegativeToEnd {
	public static void main(String[] args) {
		int arr[]= {-1,-2,7,9,-2,7,-4,9,-3};
		int j=0,temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			
		}
		System.out.print((Arrays.toString(arr)));
	}

}
