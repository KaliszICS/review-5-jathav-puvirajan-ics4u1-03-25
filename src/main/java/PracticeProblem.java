import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		in.nextLine();
		System.out.println(Math.abs(num));
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.floor(num1/num2));
		System.out.println(Math.ceil(num1/num2));
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		in.nextLine();
		System.out.println(Math.round(Math.sqrt(num)));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.pow(num1, num2));
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		in.nextLine();
		System.out.print("Input one more number: ");
		double num3 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.max(Math.max(num1,num2),num3));
		System.out.println(Math.min(Math.min(num1,num2),num3));
		
		
	}
	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String str = in.nextLine();
		System.out.println(str.contains("on"));
		
	}
	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String str = in.nextLine();
		System.out.println(str.equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String str = in.nextLine();
		System.out.print("Input a letter: ");
		String chr = in.nextLine();
		System.out.println(str.indexOf(chr));
		System.out.println(str.lastIndexOf(chr));
		
	}

	public static void q9() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String str = in.nextLine();
		System.out.println("Your sentence is " + str.length() + " characters long");
		
	}
	public static void q10() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String str = in.nextLine();
		System.out.print("Input a word to replace: ");
		String str2 = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String str3 = in.nextLine();
		System.out.println(str.replaceAll(str2,str3));
		
	}

	public static void q11() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String str = in.nextLine().trim();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
	}

	public static void q12() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String str = in.nextLine();
		System.out.println(str.substring(0,4));
		
		System.out.println(str.substring(str.length()-4,str.length()));
		
	}
	

}
