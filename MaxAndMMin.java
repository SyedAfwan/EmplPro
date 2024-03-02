package AllinOne;

public class MaxAndMMin {
	
	
	public static void main(String[] args) {
		int a[]= {1,10,50,69,554,87845,7520};
//		int max=a[0];
//		int min=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			
//				if(a[i]<min) 
//					min=a[i];
//				}
//			}
//			System.out.println("maximum value is "+max);
//			System.out.println("maximum value is "+min);
//		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				if(a[i]<min)
					min=a[i];
			}
		}
		System.out.println("maximum value is "+max);
		System.out.println("maximum value is "+min);
	}	
	}	
