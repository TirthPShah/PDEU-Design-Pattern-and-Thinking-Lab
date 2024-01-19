import com.club.*;
import java.util.Scanner;

public class ClubSelectionHelper {
	
	public static void main (String[] args) {

		ClubSelectionGiver helper = new ClubSelectionGiver();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your domain of interest to find your suitable club: ");
		String dOI = scanner.next();
		
		baseClub clubFound = helper.getInstance(dOI);
		
		clubFound.spec();
		
		scanner.close();
	}
	
}