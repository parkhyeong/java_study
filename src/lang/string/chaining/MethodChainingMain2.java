package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        ValueAdder add1 = adder.add(1);
        ValueAdder add2 = adder.add(2);
        ValueAdder add3 = adder.add(3);

        System.out.println("adder = " + add3.getValue());

        System.out.println("add1 = " + add1);
        System.out.println("add2 = " + add2);
        System.out.println("add3 = " + add3);
    }
}
