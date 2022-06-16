package assignment.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 13;
		boolean flag = false;
		for (int i =2; i<number/2; i++) {
			if (number%i==0) {
				System.out.println(number + " is not a prime number");
				flag = true;
				break;
			}
				//else
		if (!flag) {
				System.out.println(number + " is a prime number");
			break; 
				
		}
	//		else
		//System.out.println("is not a prime number");
			}
			}
		}
		

	


