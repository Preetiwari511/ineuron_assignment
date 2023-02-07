package assignment2;

public class Trainer
{
	
	 String name;
	 String department;
	 String email;
	 String subject;
	 
	 Trainer(int value) {
		 System.out.println("ID if the trainer is "+ value);
	 }
	 
	 void addName(String newValue)
	 {
		 name = newValue;	 
	 }
	 
	 void addDepartment(String newValue ) 
	 {
		 department = newValue;
	 }
	 
	 void addEmail(String newValue) 
	 {
		 email = newValue;
	 }
	 
	 void addSub(String newValue){
		 subject = newValue;
	 }
	 
	 void printInfo() {
		 System.out.println("Trainer "+name+" teaches "+ subject +" is in "+ department + " department");
		 System.out.println("Contact on the email address- "+ email);
		 System.out.println();
	 }
	
	

	public static void main(String[] args) 
	{
		Trainer trainer1 = new Trainer(1);
		trainer1.addName("Mukesh");
		trainer1.addDepartment("Testing");
		trainer1.addEmail("mukesh@gmail.com");
		trainer1.addSub("Automation");
		trainer1.printInfo();
		
		Trainer trainer2 = new Trainer(2);
		trainer2.addName("Hitesh");
		trainer2.addDepartment("Dev");
		trainer2.addEmail("hitesh@gmail.com");
		trainer2.addSub("Web Development");
		trainer2.printInfo();
		
		
		Trainer trainer3 = new Trainer(3);
		trainer3.addName("Mukesh");
		trainer3.addDepartment("Devops");
		trainer3.addEmail("mukesh@gmail.com");
		trainer3.addSub("Dev&Operations");
		trainer3.printInfo();
		
		
	}

}
