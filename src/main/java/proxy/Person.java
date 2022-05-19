package proxy;

public interface Person {
    //  获取姓名
    String getName();

    //  获取评级
    int getGeekRating();

    void setName(String name);

    //  设置兴趣
    void setInterests(String interests);

    //  设置评级
    void setGeekRating(int rating);

}
