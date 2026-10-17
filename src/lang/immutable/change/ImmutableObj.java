package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        // 인라인 단축키 ctrl + alt + n
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }
}
