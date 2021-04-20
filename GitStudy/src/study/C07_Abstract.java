package study;

public class C07_Abstract {

	/*
	 	# �߻� Ŭ���� (abstract class)
	 	
	 		- �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
	 		- Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ������ �տ� abstact�� �ٿ� �ݵ�� ǥ���ؾ� �Ѵ�.
	 		- ������ �߻� �޼��带 �����ϱ� ������ �ν��Ͻ� ������ �Ұ����ϴ�
	 		
	 	# �߻� �޼���(abstract class)
	 	
	 		- �޼����� ����(���� Ÿ��, ���� ������, �Ű�����)�� ���س��� 
	 		  �ڼ��� ������ �ڽ� Ŭ�������� ���ٶ��̵带 ���� �����ϴ� �޼���
	 		- �ڽ� Ŭ�������� ���ٶ��̵� ���� ������ ������ ������ �߻��Ѵ�
	 */

	public static void main(String[] args) {
		Vehicle v1 = new Bus();
		
		// �͸� Ŭ���� (Anonymous class)
		Vehicle v2 = new Vehicle() {

			@Override
			void ride() {
				System.out.println("�Ｎ���� ������ Ż��");
			}
		};
		v1.ride();
		v2.ride();
	}
}


abstract class Vehicle {
	
	abstract void ride(); 
	
}

class Bus extends Vehicle{
	@Override
	void ride() {
		System.out.println("����� ���� Ÿ����");
	}
	
}

abstract class Bike extends Vehicle{
	
	// �������̵� ���� (���� �Լ���, ���� ���� Ÿ��, ���� �Ű�����)
	@Override	
	abstract void ride(); 
}

class ���������� extends Vehicle{
	
	@Override
	void ride() {}
}





