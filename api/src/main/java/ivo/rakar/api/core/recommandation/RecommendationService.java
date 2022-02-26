package ivo.rakar.api.core.recommandation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RecommendationService {
    /**
     * Sample usage: "curl $HOST:$PORT/recommendation?menuItemId=1".
     *
     * @param menuItemId Id of the menu item
     * @return the recommendations of the menu-item
     */
    @GetMapping(
            value = "/recommendation",
            produces = "application/json")
    List<Recommendation> getRecommendations(
            @RequestParam(value = "menuItemId", required = true) int menuItemId);
}
