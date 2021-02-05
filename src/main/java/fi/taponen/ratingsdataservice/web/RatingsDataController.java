package fi.taponen.ratingsdataservice.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.taponen.ratingsdataservice.domain.Rating;
import fi.taponen.ratingsdataservice.domain.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {
	
	@RequestMapping("/{productId}")
	public Rating getRating(@PathVariable("productId") String productId) {
		return new Rating(productId, 4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings =  Arrays.asList(
			new Rating("1234", 2),
			new Rating("4321", 5)
		);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		
		return userRating;
	}
}
