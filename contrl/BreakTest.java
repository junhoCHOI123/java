package contrl;

public class BreakTest {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		for(;i<=10;i++) {
			sum+=i;
			if(sum>30)break;
		}
		System.out.println("1부터 "+i+"까지 합계는 "+sum+"입니다.");
	}
}