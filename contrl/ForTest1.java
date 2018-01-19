package contrl;

public class ForTest1 {
	public static void main(String[] args) {
		for(int i = 1;i<11;i++) {
			System.out.println("나무를 "+i+"번 찍었습니다.");
			if(i==10) 
				System.out.println("나무가 쓰러졌습니다.");
		}
	}
}