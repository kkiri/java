package p201;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("����ӵ�: " + myCar.speed);
		
		myCar.maxSpeed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}
}
