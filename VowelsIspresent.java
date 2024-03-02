package AllinOne;

public class VowelsIspresent {
	public static void main(String[] args) {
		String str="hello my name is afwan";
		int count =0;
		String s=str.toLowerCase();
		for(int i =0;i<str.length();i++) {
			char ch=s.charAt(i);
			if(ch =='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
