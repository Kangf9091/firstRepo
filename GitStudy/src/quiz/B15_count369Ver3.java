package quiz;

public class B15_count369Ver3 {

	public static void main(String[] args) {
		
		int input = 5678;
		int clap = 0;
		
		for (int i = 1; i <= input; ++i) {
			
			int testValue = i;
			System.out.print(i + " :");
			
			while (testValue > 0) {
				int digit = testValue % 10;
				
				if(digit % 3 ==0 && digit != 0) {
					//digit % 10 == 3 || digit % 10 == 6 || digit % 10 == 9				
					clap++;
					System.out.print("¦");
			}
				testValue /=10;
		}
		System.out.println();
		
		
		
//		System.out.println(i % 10);
//		System.out.println(i / 10 % 10);
//		System.out.println(i / 10 / 10 % 10);
		
//    	System.out.println(testValue / 1000);
//    	System.out.println(testValue % 1000 / 100);
//    	System.out.println(testValue % 100 / 10);
//    	System.out.println(testValue % 10);
		

	}
	}
}
