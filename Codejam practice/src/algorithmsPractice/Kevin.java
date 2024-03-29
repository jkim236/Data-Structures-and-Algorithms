// Solved: Nov/14/2022

/**
* Problem statement:
* Given a set of distinct integers from 1 to n, arrange them in a way that maximizes 
* the minimum absolute difference between consecutive elements. The goal is to output 
* any permutation that satisfies this condition.
*/
package algorithmsPractice;
import java.util.Scanner; 

/** The code takes the number of test cases and the size of the set as inputs, and 
* then it prints a permutation of the numbers that satisfies this condition.
* To do this, the code calculates the maximum possible value of the minimum absolute 
* difference between consecutive elements, and then prints the permutation using a loop. 
* Finally, the output is printed on separate lines for each test case.
*/
public class Kevin {
	public static void main(String[] args) {
		try(Scanner console = new Scanner(System.in)) {
			int cases = console.nextInt();
			for (int i = 1; i <= cases; i ++) {
				int len = console.nextInt();
				int num = len / 2;
				if (len % 2 == 1) {
					num ++;
				}
				int divisor = 1;
				for (int j = 0; j < num; j ++) {
					System.out.print((num - j) + " ");
					if (j != num - 1 || len % 2 == 0) {
						System.out.print((len - j) + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
