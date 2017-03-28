package net.jptechnology.android.inclassassignment08_johnp;

public class User {
    private String username;
    private String password;
    private String picUrl;
    private boolean isLegalAge;

    public User() {
    } // Empty constructor is needed to read from Firebase

    public User(String username, String password, String picUrl, boolean isLegalAge) {
        this.username = username;
        this.password = password;
        this.picUrl = picUrl;
        this.isLegalAge = isLegalAge;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public boolean isLegalAge() {
        return isLegalAge;
    }

    @Override
    public String toString() {
        return username + " " + password + " "
                + isLegalAge + "\n" + picUrl;
    }
}
