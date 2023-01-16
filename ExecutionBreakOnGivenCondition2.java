package ineuronAssignment1;

public class ExecutionBreakOnGivenCondition2 {

	public static void main(String[] args) {
		int[] num = new int[5];
		num[0]=12;
		num[1]=34;
		num[2]=66;
		num[3]=85;
		num[4]=900;
		for(int i=0;i< num.length;i++) {
			if(num[i]==85) {
				break;
			}
			else {
				System.out.println(num[i]);
			}
		}
		
	}

}
