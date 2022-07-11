package Exercise;

public class Student {
    private String userId;
    private String username;
    private String birthday;

    public Student(String userId, String username, String birthday) {
        this.userId = userId;
        this.username = username;
        this.birthday = birthday;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String info() {
        String[] row = {this.userId, this.username, this.birthday};
        return String.join("    ", row);
    }
}
