package ivo.rakar.api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ReviewService {
    /**
     * Sample usage: "curl $HOST:$PORT/review?menuItemId=1".
     *
     * @param menuItemId Id of the menu item
     * @return the reviews of the menu item
     */
    @GetMapping(
            value = "/review",
            produces = "application/json")
    List<Review> getReviews(@RequestParam(value = "menuItemId", required = true) int menuItemId);
}
