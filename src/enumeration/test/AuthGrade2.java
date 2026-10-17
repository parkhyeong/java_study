package enumeration.test;

public class AuthGrade2 {

    public final static AuthGrade2 GUEST =  new AuthGrade2(1, "손님");
    public final static AuthGrade2 LOGIN = new AuthGrade2(2, "로그인 회원");
    public final static AuthGrade2 ADMIN = new AuthGrade2(3, "관리자");

    private final int  level;
    private final String description;

    public AuthGrade2(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
