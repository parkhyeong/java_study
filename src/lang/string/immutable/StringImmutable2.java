package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        // String 불변이다
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
