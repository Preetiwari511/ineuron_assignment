package assignment2;
import java.util.Scanner;
public class InfoInArray {
	Scanner s = new Scanner(System.in);
	
	Object[][] getArray() {
		System.out.println("Enter the number of rows");
		int row = s.nextInt();
		System.out.println("Enter number of columns");
		int col = s.nextInt();
		Object[][] arr = new Object[row][col];
		return arr;
	}
	
	
	Object[][] setValue(String person) {
		Object[][] myInfo = getArray();
		for(int i=0;i<myInfo.length;i++) {
			for(int j=0;j<myInfo[i].length;j++) {
				
					if(person=="trainer"|| person=="student") 
					{
						System.out.println("Enter the name of the " + person);
						String name = s.next();
						myInfo[i][j] = name;
						j++;
						System.out.println("Enter the email ID");
						String email = s.next();
						myInfo[i][j]= email;
						j++;
						
					}
					if(person =="trainer")
					{
						System.out.println("Enter the Id of the " + person);
						int id = s.nextInt();
						myInfo[i][j] =id;
						j++;
						System.out.println("Enter the department of the " + person);
						String dept = s.next();
						myInfo[i][j]= dept;
						j++;
						System.out.println("Enter the subject "+ person);
						String sub =s.next();
						myInfo[i][j]=sub;
					}
				}
		}
		return myInfo;	
	}
	
	void getInfo(String person) {
		Object[][] infoTable = setValue(person);
		for(int i =0;i<infoTable.length;i++) {
			for(int j=0;j<infoTable[i].length;j++) {
				System.out.print(infoTable[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		InfoInArray obj = new InfoInArray();
		obj.getInfo("trainer");
	}

}
