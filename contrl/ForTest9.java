package contrl;

public class ForTest9 {
	public static void main(String[] args) {
		for(int i=2 ; i<=9 ; i+=4) {
			for(int j=1 ; j<=9 ; j++) {
				for(int k=i;k<=i+3;k++) {
					System.out.print(k+"*"+j+"="+(k*j) + "\t");
				}
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
