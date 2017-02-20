import java.util.Scanner;

public class QBRatings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("TD: ");
		double TD = input.nextDouble();

		while (TD < 0.0) {
			System.out.print("Invalid Input, enter new value: ");
			TD = input.nextDouble();
			System.out.print("\n");
		}

		System.out.print("YDS: ");
		double YDS = input.nextDouble();

		while (YDS < 0.0) {
			System.out.print("Invalid Input, enter new value: ");
			YDS = input.nextDouble();
			System.out.print("\n");
		}

		System.out.print("INTCP: ");
		double INTCP = input.nextDouble();

		while (INTCP < 0.0) {
			System.out.print("Invalid Input, enter new value: ");
			INTCP = input.nextDouble();
			System.out.print("\n");
		}

		System.out.print("COMP: ");
		double COMP = input.nextDouble();

		while (COMP < 0.0) {
			System.out.print("Invalid Input, enter new value: ");
			COMP = input.nextDouble();
			System.out.print("\n");
		}

		System.out.print("ATT: ");
		double ATT = input.nextDouble();

		while (ATT <= 0.0) {
			System.out.print("Invalid Input, enter new value: ");
			ATT = input.nextDouble();
			System.out.print("\n");
		}
		
		if (ATT == 0){
			System.out.print(0);
		}
			double a = ((double) COMP / ATT - 0.3) * 5.0;
			if (a>2.375){
				a = 2.375;
			}
			if (a<0){
				a = 0;
			}
			double b = ((double) YDS / ATT - 3.0) * 0.25;
			if (b>2.375){
				b = 2.375;
			}
			if (b<0){
				b = 0;
			}
			double c = ((double) TD / ATT) * 20.0;
			if (c>2.375){
				c = 2.375;
			}
			if (c<0){
				c = 0;
			}
			double d = 2.375 - ((double) INTCP / ATT * 25.0);
			if (d>2.375){
				d = 2.375;
			}
			if (d<0){
				d = 0;
			}
			double passerRating = ((a + b + c + d) / 6.0) * 100.0;
			if (passerRating < 0){
				System.out.print(0);
			}
			if (0 > passerRating){
				System.out.print(0);
			}
			if (158.3 > passerRating){
				System.out.printf("%3.1f",passerRating);
			}
			if (158.3 <= passerRating){
				System.out.print(158.3);
			}
	}
}

