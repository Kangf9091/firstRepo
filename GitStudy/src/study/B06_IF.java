package study;

public class B06_IF {
	
	public static void main(String[] args) {
		
		/*
		 	# if 문
		 	
		 		- ()안의 값이 true 일 때 {} 안의 내용을 실행한다
		 		- ()안의 값이 false 일때는 {}안의 내용을 무시한다
		 		- {}안에 들어갈 내용이 단 한줄이라면 {}를 생략 할 수 있다
		 		
		 	# else if문
		 		- 위에 있는 if문이 실행되지 않았다면 if문처럼 동작한다
		 		- else if는 단독으로 사용 할 수 없다
		 		- else if는 여러 개 사용할 수 있다
		 		
		 	# else문
		 	 - 위에 있는 if, else if가 모두 실행되지 않았다면 {}안의 내용을 무조건 실행한다
		 	 - if 바로 다음에 쓸 수도 있다
		 	 - else 
		 		
		*/
		int a = 6;
		
		
		if (a == 5) {
			System.out.println("Hello!");
			System.out.println("Hello2");
			
		} else if (a == 6) {
			System.out.println("Nice to meet you!");
		} else if (a > -10) {
			System.out.println("Greeting!");
		} else if (a > -20) {
			System.out.println("Good to see you!");
		}
		
	//--------------------------------------------------------------------
		
		char  ch = 0x3050;
		
		if (ch >= '가' && ch <= '힣') {
			System.out.println("ch에 들어있는 값은 한글입니다");
		}else if (ch >= 0x3040 && ch <= 0x30FF ){
			System.out.println("ch에 들어있는 값은 일본어 입니다");
		}else  {
			System.out.println("ch에 들어있는 값은 한글이 아닙니다");
		}
		
		
		System.out.println("프로그램이 끝났습니다.");
			
	}
}

