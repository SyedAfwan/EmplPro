package AllinOne;

public class MissingElement {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8};
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
////			System.out.println(sum);
//		}
//		System.out.println(sum);
//		int sum1=0;
//		for(int j=1;j<=7;j++) {
//			sum1=sum1+j;
//		}
//		System.out.println(sum1);
//		System.out.println("Missing element is" + (sum - sum1));
//	}
		int n=a.length+1;
		int sum=(n*(n+1)/2);
		for(int i=0;i<a.length;i++) {
			sum=sum-a[i];
		}
		System.out.println("missing number is "+sum);
	
	}
}
