package lang.string.test;

public class ToString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] split = email.split("@");
        String idpart = split[0];
        String domainpart = split[1];

        System.out.println("idpart = " + idpart);
        System.out.println("domainpart = " + domainpart);
    }
}
