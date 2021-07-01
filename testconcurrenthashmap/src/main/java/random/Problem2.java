package random;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Problem2 {

	static Map<String, BigDecimal> claims = new HashMap<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] numberOfPairs = scanner.nextLine().split(" ");
		String founderName = scanner.nextLine();

		String[][] familyTree = new String[9][3];

		for (int i = 0; i < Integer.valueOf(numberOfPairs[0]); i++) {

			String familyRelationShip = scanner.nextLine();
			String[] parentChild = familyRelationShip.split(" ");
			for (int j = 0; j < parentChild.length; j++) {
				familyTree[i][j] = parentChild[j];
			}
		}

		List<String> listOfClaimants = new ArrayList<>();
		for (int i = 0; i < Integer.valueOf(numberOfPairs[1]); i++) {
			String claimant = scanner.nextLine();
			listOfClaimants.add(claimant);
		}

		for(int i=0; i<familyTree.length; i++) {

			for(int j=0; j<familyTree[i].length; j++) {
				//System.out.println("Values at arr["+i+"]["+j+"] is "+familyTree[i][j]);
				find(familyTree[i][0], familyTree[i][1], familyTree[i][2], founderName);
			}
		}

		System.out.println(claims);


	}

	static void find(String child, String p1, String p2, String founder){

		BigDecimal bloodPoints = BigDecimal.ZERO;

		//if one founder present
		if(p1.equals(founder) || p2.equals(founder)){
			bloodPoints = BigDecimal.ONE.divide(new BigDecimal(2));
		}
		//check if already child of child
		//1.) check if p1 founder
		if(!p1.equals(founder) && claims.get(p1) !=null){
			bloodPoints = claims.get(p1).divide(new BigDecimal(2));
		} else if(!p2.equals(founder) && claims.get(p2) !=null){
			bloodPoints = claims.get(p2).divide(new BigDecimal(2));
		}
		claims.put(child, bloodPoints);
	}
}
