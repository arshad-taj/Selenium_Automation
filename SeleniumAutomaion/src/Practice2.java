import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	   // System.out.println(capitalCities); 
	    
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    	}
	}

}
