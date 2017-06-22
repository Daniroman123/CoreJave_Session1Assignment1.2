/*Write a program to print the result of the following expressions provided the integer variable a is 20 and b is 10

int b= a-- - --a;
int c=a--;
int d=a>>2;
int e=a&b;
*/
package expressions;

public class PrintExpressions {

	public static void main(String[] args) {
		int a= 20, b= 10; // declaring the values of a and b
		
		/* the question actually asks int b= a-- - --a; but this doesn't
		make sense since b is already defined, so i'll take a variable f */
		
		int f = a-- - --a; // f = 20 - 18 because post-fix doesn't work for long expressions
		System.out.println("The value of f is ");
	    System.out.println(f);
		System.out.println("The value of c is ");
		int c = a--; // 20 - 1 - 1 = 18
		System.out.println(c);
		int d=a>>2; // right shift the binary of 'a' twice 10100 >> 2 = 00101 (5) 
	    //or divide 'a' by 2 twice 20>>2 = (20 /2)/2 same result
		System.out.println("The value of d is ");
		System.out.println(d);
		int e=a&b; // 10100 AND 01010 = 00000
		System.out.println("The value of e is ");
		System.out.println(e);

	}

}
