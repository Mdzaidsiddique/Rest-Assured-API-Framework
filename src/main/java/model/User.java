package model;

// User POJO
public class User {
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    public User(int id, String email, String first_name, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }

    // Getters and setters if needed
}
