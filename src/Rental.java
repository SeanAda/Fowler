class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    
    public double getCharge() {
		
    	return this.getMovie().getCharge(this.getDaysRented());
	}
    
    public int getFrequentRenterPoints() {
		
    	return this.getMovie().getFrequentRenterPoints(this.getDaysRented());
	}
}