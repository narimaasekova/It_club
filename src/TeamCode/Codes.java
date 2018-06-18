package TeamCode;

<<<<<<< HEAD

=======
import java.util.ArrayList;
>>>>>>> f1d90d1488e7f2890d6b98e173f0168dd7598025

public class Codes {

	public static void main(String[] args) {
<<<<<<< HEAD
		System.setProperty("webdriver.chrome.driver", 
				"/Users/asme/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
=======
	
		int[] arr = new int[] { 1, 2,6,6,4, 3, 1, 2, 3, 4, 5 };

		ArrayList<Integer> unique = new ArrayList<>();

		 opp: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					continue opp;

				} 

			}
			unique.add(arr[i]);
		}
		System.out.println(unique.toString());
	}

}
>>>>>>> f1d90d1488e7f2890d6b98e173f0168dd7598025

	}

}
