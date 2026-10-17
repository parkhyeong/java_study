package lang.string.test;

public class ToString6 {

    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int index  = 0;
        int count = 0;
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count ++;
        }

        System.out.println("count = " + count);
    }
}
