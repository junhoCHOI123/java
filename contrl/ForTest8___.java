package contrl;

/*public class ForTest8 {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) 
		{
			for(int j=1;j-i<0;j++) 
			{
			System.out.print("¢¾");
			}
			for(int a=5;a-i>=0;a--)
			{
				System.out.print("¢½");
			}
			
			System.out.println(" ");
		}
	}
}*/

public class ForTest8___ {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) 
		{
			for(int j=1;j<=5;j++) {
			if(6-i<=j)
			System.out.print("¢½");
			else
				System.out.print("¢¾");
			}
			
			
			System.out.println(" ");
		}
	}
}

