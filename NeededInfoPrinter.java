package assignment2;
import java.util.Scanner;
public class NeededInfoPrinter {

	public static void main(String[] args) {
		 InfoInArray obj = new InfoInArray(); 
		 Object[][] stInfo = obj.setValue("student");
			System.out.println("Enter the name of the student to get info");
			 Scanner s = new Scanner(System.in);
			 String st = s.next();
			 
		 for(int i=0;i< stInfo.length;i++) {
			 if(stInfo[i][0].equals(st)) {
				 for(int j=0;j<stInfo[i].length;j++) {
					 System.out.println(stInfo[i][j]);
				 }
			 }
		 }
		 s.close();
	}



}


