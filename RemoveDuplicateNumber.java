package AllinOne;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		int arr[]= {1,3,7,9,3,7,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elements are" +arr[j]);
				}
			}
		}
	}

}
