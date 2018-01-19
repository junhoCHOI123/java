package contrl;
import java.util.Scanner;
public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;						//숫자 랜덤, 받기
		int stk = 0;
		int ball = 0;
		int count = 0;
		n1=(int)Math.random()*10;
		do {
			n2 = (int) Math.random() * 10;
		} while (n1==n2);
		do {
			n3 = (int) Math.random() * 10;
		} while (n3==n2 || n3==n1);
		
		do {
		System.out.print("0부터9까지의 정수 중 3개를 입력하시오 : ");
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		
		if(n1==p1) stk++;
		else if(n1==p2 || n1==p3) ball++;
		if(n2==p2) stk++;
		else if(n2==p1 || n2==p3) ball++;
		if(n3==p3) stk++;
		else if(n3==p1 || n3==p2) ball++;
		
		System.out.println("stk : "+stk + "," +"ball :"+ ball);
		count++;
		}while(stk<3);
		
		System.out.print("축하합니다." + count+"번 만에 맞추셨습니다.");
	}
}
