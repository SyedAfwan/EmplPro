package AllinOne;

public class ConvertAllZeroToFive {
	public static void main(String[] args) {
		int n=501020408;
		int reminder;
		int newnumber=0;
		while(n!=0) {
			reminder=n%10;
			n=n/10;
			if(reminder!=0) {
				newnumber=newnumber*10+reminder;
			}
			else {
				newnumber=newnumber*10+5;
			}
			int reversenumber=0;
			while(newnumber!=0) {
				reminder=newnumber%10;
				newnumber=newnumber/10;
				reversenumber=reversenumber*10+reminder;
			}
			System.out.println(newnumber);
	}
	}
}
