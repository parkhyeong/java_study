package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(3, "JAVA")
                .delete(4, 8).toString();

        System.out.println("string = " + string);
    }
}
