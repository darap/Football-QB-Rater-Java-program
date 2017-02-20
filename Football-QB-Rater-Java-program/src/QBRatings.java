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
	}

	public double QBRating(int ATT, int COMP, int YDS, int TD, int INTCP) {

		if (ATT == 0)
			return 0;
		{
			double a = ((double) COMP / ATT - 0.3) * 5.0;
			double b = ((double) YDS / ATT - 3.0) * 0.25;
			double c = ((double) TD / ATT) * 20.0;
			double d = 2.375 - ((double) INTCP / ATT * 25.0);
			double passerRating = ((a + b + c + d) / 6.0) * 100.0;
			return (passerRating < 0) ? 0.0 : passerRating;
		}
	}
}
