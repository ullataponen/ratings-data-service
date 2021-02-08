package fi.taponen.ratingsdataservice.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.taponen.ratingsdataservice.domain.Rating;
import fi.taponen.ratingsdataservice.domain.UserRating;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {
	
	@RequestMapping("/products/{productId}")
	public Rating getRating(@PathVariable("productId") long productId) {
		return new Rating(productId, 4);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		
		UserRating userRating = new UserRating();
		userRating.initData(userId);
		return userRating;
	}
}
