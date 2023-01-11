
	import java.util.Scanner;
	public class StarPattern {
	public static void main(String [] args) {
		System.out.println("Enter number of rows to be print");
		//1.Inverted star pattern
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i+1;j++) {
				System.out.print("**");
			}
			System.out.println("");
		}
		rows--;
	for(int i=0;i<=rows;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("**");
		}

		System.out.println("");
		}
	}
	}

