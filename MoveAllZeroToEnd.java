package AllinOne;

public class MoveAllZeroToEnd {
	public static void main(String[] args) {
		int arr[]= {1,4,0,9,0,7,0,5,0,9};
		int len=arr.length;
		int count=0;
		for(int i=0;i < len;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		while(count <len) {
			arr[count++]=0;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] +" ");
		}
	}
}
