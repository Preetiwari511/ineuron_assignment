package ineuronAssignment1;

public class PrintEvenNums {

	public static void main(String[] args) {
		int lastNum= 500;
		for(int i =2;i<=lastNum ;i++) {
			if(i%2==0) {
				System.out.println(i + "");	
			}
		}
	}
}
