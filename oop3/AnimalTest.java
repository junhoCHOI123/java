package oop3;

public class AnimalTest {
	public static void main(String[] args) {
//		Eagle eagle = new Eagle();
//		System.out.println(eagle);
		
//		Bird bird = new Eagle();	//upcasting - �ڵ�����ȯ
//		System.out.println(bird);
		
//		Animal animal = new Eagle();
//		System.out.println(animal);
		
//		Bird bird = (Bird) animal;
//		System.out.println(bird);
		
		
//		Animal animal = new Bird();
//		System.out.println(animal);
		
//		Condor condor = (Condor) new Eagle();	//downcasting - ��������ȯ
//		System.out.println(condor);
		
		Object object = new Tiger();
		System.out.println(object);
		if(object instanceof Tiger) {				//ĳ���� ����, �Ұ��� ���� �˷���.
			System.out.println("Tiger�� ĳ���� ����");
			Tiger tiger=(Tiger)object;
			System.out.println(tiger);
		}else {
			System.out.println("Tiger�� ĳ���� �Ұ���");
		}
//		Tiger tiger = (Tiger)object;
//		System.out.println(tiger);
		
		
	}
}
