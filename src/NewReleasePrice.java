
public class NewReleasePrice extends Price {
	
	int getPriceCode() {
		 return Movie.NEW_RELEASE;
	 }
	
	double getCharge(int daysRented) {
		double result = daysRented * 3;
		return result;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		
		 // add bonus for a two day new release rental
		if (daysRented > 1)  {
			return 2;
		}
		else {
			return 1;
		}
	}
}
