package ineuronAssignment1;

public class PrimeNums {

	public static void main(String[] args) {
		System.out.println("Prime number between 1 to 1000 :");
		for(int i=2;i<=1000;i++) {
			int j;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				System.out.println(i);
				}
		}
	}

}
