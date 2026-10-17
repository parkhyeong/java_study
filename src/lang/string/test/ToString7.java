package lang.string.test;

public class ToString7 {

    public static void main(String[] args) {
        String orignal = "      Heollo Java     ";

        String trimmed = orignal.trim();

        String strip = orignal.strip();
        System.out.println("trim = " + trimmed);
        System.out.println("strip = " + strip);
    }
}
