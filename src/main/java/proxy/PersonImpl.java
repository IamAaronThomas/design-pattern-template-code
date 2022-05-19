package proxy;

public class PersonImpl implements Person {
    String name;
    //  兴趣
    String interests;
    //  评分
    int rating;
    //  评级总计
    int ratingCount = 0;

    public String getName() {
        return name;
    }

    public int getGeekRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return (rating / ratingCount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setGeekRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

}
