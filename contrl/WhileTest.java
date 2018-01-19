package contrl;

public class WhileTest {
	public static void main(String[] args) {
		int i =1;
		while(i<11) {
			System.out.println("나무를 "+i+"번 찍었습니다.");
			if(i==10) 
				System.out.println("나무가 쓰러졌습니다.");
			i++;
		}
	}
}
