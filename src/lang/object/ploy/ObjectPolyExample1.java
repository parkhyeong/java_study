package lang.object.ploy;

public class ObjectPolyExample1 {

    //psvm
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(car);
    }

    private static void action(Object obj) {

        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }

    }

}
