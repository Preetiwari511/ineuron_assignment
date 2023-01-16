package ineuronAssignment1;

public class ExecutionBreakOnGivenCondition {

	public static void main(String[] args) {
		String[] name = new String[5];
		name[0]="Java";
		name[1]="JavaScript";
		name[2]="Selenium";
		name[3]="Python";
		name[4]="Mukesh";
		for(int i=0;i< name.length;i++) {
			if(name[i]=="Selenium") {
				break;
			}
			else {
				System.out.println(name[i]);
			}
		}
		
	}

}
