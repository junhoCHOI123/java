package contrl;
import java.util.Scanner;

public class IfTest_Ex2 {
	public static void main(String[] args) {
		System.out.print("����:1, ����:2, ��:3 \n���ڸ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int put = sc.nextInt();
		
		int com = (int)((Math.random()*3)+1);
		System.out.println("��ǻ�� : "+com);
		if(put==1) {
			if(com==1) {
				System.out.print("���º�");
			}
			else if(com==2) {
				System.out.print("�й�");
			}
			else {
				System.out.print("�¸�");
			}
		}
		else if(put==2) {
			if(com==1) {
				System.out.print("�¸�");
			}
			else if(com==2) {
				System.out.print("���º�");
			}
			else {
				System.out.print("�й�");
			}
		}
		else {
			if(com==1) {
				System.out.print("�й�");
			}
			else if(com==2) {
				System.out.print("�¸�");
			}
			else {
				System.out.print("���º�");
			}
		}
	}
}
