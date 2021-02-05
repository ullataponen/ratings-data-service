package fi.taponen.ratingsdataservice.domain;

public class Rating {
	
	private String productId;
	private int rating;
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String productId, int rating) {
		super();
		this.productId = productId;
		this.rating = rating;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
