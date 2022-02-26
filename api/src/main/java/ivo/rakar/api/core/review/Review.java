package ivo.rakar.api.core.review;

public class Review {
    private final int menuItemId;
    private final int reviewId;
    private final String author;
    private final String subject;
    private final String content;
    private final String serviceAddress;

    public Review() {
        menuItemId = 0;
        reviewId = 0;
        author = null;
        subject = null;
        content = null;
        serviceAddress = null;
    }

    public Review(
            int menuItemId,
            int reviewId,
            String author,
            String subject,
            String content,
            String serviceAddress) {

        this.menuItemId = menuItemId;
        this.reviewId = reviewId;
        this.author = author;
        this.subject = subject;
        this.content = content;
        this.serviceAddress = serviceAddress;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
