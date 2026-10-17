package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; // 참조형, 자바언어에서 변경해줌 new String("hello");
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
}
