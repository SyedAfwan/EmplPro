package AllinOne;

public class SortTheArray {
	public static void main(String[] args) {
		int a[]= {1,8,9,6,4,3,2};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
