package AllinOne;

public class ReverseTheArray {
	public static void main(String[] args) {
		int a[]= {1,10,8,97,8588};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("original");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i] +" ");
		}
	}
}
