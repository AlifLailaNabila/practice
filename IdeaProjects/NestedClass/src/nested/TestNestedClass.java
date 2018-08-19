package nested;

public class TestNestedClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.outerMethodA();
        oc.innerA.innerAMethodA();
    }
}
