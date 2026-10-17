package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // 자바에서 String은 +를 지원해줌

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
