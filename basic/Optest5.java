package basic;

public class Optest5 {
	public static void main(String[] args) {
		int a = 7;
		int b = ++a;		//a = a+1을 먼저 시행
							//then, b에 a를 저장
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
