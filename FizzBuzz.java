//Beth Lane

/*Write a program that prints integers 1 through 100
*For every integer divisible by 3, print "Fizz"
*For every integer divisible by 5, pring "Buzz"
*For every integer divisible by both 3 and 5, print "FizzBuzz"
*/

public class FizzBuzz {
	public static void main (String[] args){
		//For loop iterates through each integer starting at 1 and ending with 100
		for(int i = 1; i <= 100; i++){
			//if else statements check if a number is divisible by 5 or 3 or both
			//and prints appropriate output
			if (i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0){
				System.out.println("Fizz");
			}
			else if (i % 5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}
