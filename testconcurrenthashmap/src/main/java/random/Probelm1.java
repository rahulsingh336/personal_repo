package random;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Probelm1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfObservations = Integer.valueOf(scanner.nextLine());
		BigDecimal actualObservationMinutes = new BigDecimal(0);
		BigDecimal errorSeconds = new BigDecimal(0);
		for (int i = 0; i < numberOfObservations; i++) {
				String errorPair = scanner.nextLine();
			//String[] errObs = errorPair.split("\\s+");
			String[] errObs = errorPair.split(" ");
			actualObservationMinutes = actualObservationMinutes.add(BigDecimal.valueOf(Long.valueOf(errObs[0])));
			errorSeconds = errorSeconds.add(BigDecimal.valueOf(Long.valueOf(errObs[1])));
		}

		BigDecimal err = errorSeconds.divide((actualObservationMinutes.multiply(new BigDecimal(60))), 9, RoundingMode.HALF_UP);
		if (err.min(BigDecimal.ONE).equals(BigDecimal.ZERO)) {
			System.out.println("measurement error");
		} else {
			System.out.println(err);
		}
	}
}