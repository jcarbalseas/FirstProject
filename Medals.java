
public class Medals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int COUNTRIES = 7;
		final int MEDALS = 3;

		String[] countries = { "Australia", "Canada", "China", "Germany", "Korea", "Japan", "Russia", "United States" };

		int[][] counts = { { 1, 0, 1 }, { 1, 1, 0 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 1, 1 }, { 0, 1, 1 }, { 1, 1, 0 }, };

		System.out.println("        Country      Gold     Silver     Bronze     Total");

		for (int i = 0; i < COUNTRIES; i++) {
			System.out.printf("%15s", countries[i]);

			int total = 0;

			for (int j = 0; j < MEDALS; j++) {
				System.out.printf("%8d", counts[i][j]);
				total = total + counts[i][j];
			}
			System.out.printf("%8d\n", total);

		}
	}
}
