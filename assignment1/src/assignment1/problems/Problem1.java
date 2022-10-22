package assignment1.problems;

public class Problem1 {
	public static void main(String[] args) {
		// To print "INEURON"
		int n = 11;
		for (int i = 0; i < n; i++) {

			// to print "I"

			for (int j = 0; j < n; j++) {
				if ((i == n / 4 && j >= n / 4 && j <= (3 * n) / 4)
						|| (i == (3 * n) / 4 && j >= n / 4 && j <= (3 * n) / 4)
						|| (j == (n - 1) / 2 && i >= n / 4 && i <= (3 * n) / 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// To print "N"

			for (int j = 0; j < n; j++) {

				if ((j == n / 4 && i >= n / 4 && i <= (3 * n) / 4)
						|| (j == (3 * n) / 4 && i >= n / 4 && i <= (3 * n) / 4)
						|| (i == j && i >= n / 4 && i <= (3 * n) / 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}

			// to print "E"

			for (int j = 0; j < n; j++) {
				if ((j == n / 4 && i >= n / 4 && i <= (3 * n) / 4) || (i == n / 4 && j >= n / 4 && j <= (3 * n) / 4)
						|| (i == (n - 1) / 2 && j >= n / 4 && j <= (3 * n) / 4)
						|| (i == (3 * n) / 4 && j >= n / 4 && j <= (3 * n) / 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// To print "U"
			for (int j = 0; j < n; j++) {
				if ((j == n / 4 && i >= n / 4 && i < (3 * n) / 4) || (j == (3 * n) / 4 && i >= n / 4 && i < (3 * n) / 4)
						|| i == (3 * n) / 4 && j > n / 4 && j < (3 * n) / 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// To print "R"
			for (int j = 0; j < n; j++) {
				if ((j == n / 4 && i >= n / 4 && i <= (3 * n) / 4) || (i == n / 4 && j >= n / 4 && j <= (3 * n) / 4)
						|| (i == (n - 1) / 2 && j < (3 * n) / 4 && j >= n / 4)
						|| (j == (3 * n) / 4 && i > n / 4 && i < (n - 1) / 2)
						|| (i == j && i > (n - 1) / 2 && i <= (3 * n) / 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// To print "O"
			for (int j = 0; j < n; j++) {
				if ((i == n / 4 && j > n / 4 && j < (3 * n) / 4) || (j == n / 4 && i > n / 4 && i < (3 * n) / 4)
						|| (j == (3 * n) / 4 && i > n / 4 && i < (3 * n) / 4)
						|| (i == (3 * n) / 4 && j > n / 4 && j < (3 * n) / 4)) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}

			// To print "N"

			for (int j = 0; j < n; j++) {

				if ((j == n / 4 && i >= n / 4 && i <= (3 * n) / 4)
						|| (j == (3 * n) / 4 && i >= n / 4 && i <= (3 * n) / 4)
						|| (i == j && i >= n / 4 && i <= (3 * n) / 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}

			System.out.println();

		}
	}
}
