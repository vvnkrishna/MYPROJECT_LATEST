package InterviewDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total rows : ");
		int rows = sc.nextInt();

		System.out.println("Enter total columns : ");
		int cols = sc.nextInt();

		// 2D array

		int data[][] = new int[rows][cols];

		System.out.println("Please enter matrix data :");

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				data[i][j] = sc.nextInt();
			}
		}

		// -----Print the matrix by using different models-------//

		// --------1st model------//

		System.out.println("1st model");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

		// ---------2nd model------//

		System.out.println("2nd model");
		for (int r[] : data) {

			for (int x : r)

				System.out.print(x + " ");

			System.out.println();
		}

		// ---------3rd model------//

		System.out.println("3rd model");
		for (int y[] : data) {

			System.out.println(Arrays.toString(y));
		}

		// ---------4th model------//

		System.out.println("4th model");
		System.out.println(Arrays.deepToString(data));

		// ---------5th model------//

		/*
		 * System.out.println("5th model"); Arrays.stream(data).forEach((e) -> {
		 * Arrays.stream(e).forEach((b) -> System.out.print(b + " "));
		 * System.out.println(); });
		 */

		sc.close();
	}

}
