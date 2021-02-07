package fi.taponen.ratingsdataservice.domain;
import java.util.Arrays;
import java.util.List;

public class UserRating {


	 private String userId;
	private List<Rating> ratings;

	 public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }
	
    public List<Rating> getRatings() {
			return ratings;
		}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public void initData(String userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating(1, 3, "fulfills its purpose"),
                new Rating(2, 4, "I drilled like I've never drilled before!")
        ));
    }
	

 }
