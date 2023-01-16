package ineuronAssignment1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Value of a after swaping is : " + a);
		System.out.println("Value of b after swaping is : " + b);
	}
		

}
