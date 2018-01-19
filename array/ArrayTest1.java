package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		
		int[] n= {100,90,85};
		
		int total=0;
		for(int i=0 ; i<n.length ; i++) {
			total +=n[i];
		}
		System.out.println(total/n.length);
		/*
		int[] n = {10,20,30};
		
		for(int i=0;i<=n.length;i++)
		System.out.println(n[i]);
		*/
	}
}
