package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // 참조값 출력
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);
    }
}
