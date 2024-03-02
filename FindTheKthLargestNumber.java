package AllinOne;

public class FindTheKthLargestNumber {
	public static void main(String[] args) {
		int a[]= {8,52,6,7,25};
		int k=3;
		int max,index=0;
		for(int i=1;i<=k;i++) {
			max=a[0];
			for(int j=i;j<a.length;j++) {
				if(max<a[j]) {
					max=a[j];
					index=j;
				}
			}
			a[index]=Integer.MIN_VALUE;
			System.out.println(max);
		}
		
	}
	

}
