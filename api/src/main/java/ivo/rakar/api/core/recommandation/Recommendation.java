package ivo.rakar.api.core.recommandation;

public class Recommendation {
    private final int menuItemId;
    private final int recommendationId;
    private final String author;
    private final int rate;
    private final String content;
    private final String serviceAddress;

    public Recommendation() {
        menuItemId = 0;
        recommendationId = 0;
        author = null;
        rate = 0;
        content = null;
        serviceAddress = null;
    }

    public Recommendation(
            int productId,
            int recommendationId,
            String author,
            int rate,
            String content,
            String serviceAddress) {

        this.menuItemId = productId;
        this.recommendationId = recommendationId;
        this.author = author;
        this.rate = rate;
        this.content = content;
        this.serviceAddress = serviceAddress;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public int getRecommendationId() {
        return recommendationId;
    }

    public String getAuthor() {
        return author;
    }

    public int getRate() {
        return rate;
    }

    public String getContent() {
        return content;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
