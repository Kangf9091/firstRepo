package study;

public class C12_Interface {
	/*
	 		# 인터페이스 (Interface)
	 		
	 			- abstract class는 상속을 여러개 받을 수 없다는 단점을 보완한 것
	 			- 인터페이스 내부의 메서드는 자동으로 abstract public이 된다
	 			- 인터페이스 내부의 변수는 자동으로 final abstract이 된다
	 			- 인터페이스 내부의 메서드를 정의할때 default를 붙이면 기본 동작을 설정할 수 있다
	 */

	public static void main(String[] args) {
		new OrangeTree().click();
	}
	
}

interface CanClick {
	default void click() {
		System.out.println("클릭 인터페이스가 달려있는 클래스의 기본동작. " 
										+ "(오버라이드해서 사용해주세요)");
	}
}
interface CanPunch{
	abstract public void punch();           // 사용법 다시 확인하기
}

class OrangeTree implements CanClick , CanPunch {

	@Override
	public void punch() {
		}
	@Override
	public void click() {
		System.out.println("오렌지 나무만의 클릭 동작");
	}
}
	
	
