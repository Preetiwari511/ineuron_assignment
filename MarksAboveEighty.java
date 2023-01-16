package ineuronAssignment1;

public class MarksAboveEighty {

	public static void main(String[] args) {
		int[] marks = {78,12,89,55,35,91} ;
		for(int i=0;i<marks.length;i++) {
			int num = marks[i];
			if(num>80) {
				System.out.println(num);
			}
		}
	}

}
