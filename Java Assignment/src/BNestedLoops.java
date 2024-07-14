
public class BNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		for (int i = 1; i <= 4; i++) {
			int j = 1;
			while (j <= 5) {
				for (int k = 1; k <= 4; k++) {

					System.out.println("Value of i = " + i + " Value of j " + j + " Value of k " + k);
					j++;
					counter++;
				}
				System.out.println("Total execution = " + counter);
			}
		}
	}

}
