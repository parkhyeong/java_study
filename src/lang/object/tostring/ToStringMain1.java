package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();

        // Obejct toString() 객체의 클래스@참조값
        String string = object.toString();

        System.out.println(string);
        System.out.println(object);
    }
}
