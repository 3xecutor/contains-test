package api;

public class UserData {
    private Integer id;
    private String avatar;

    // constructor
    public UserData(Integer id, String avatar) {
        this.id = id;
        this.avatar = avatar;
    }
    // getter
    public Integer getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }
}

