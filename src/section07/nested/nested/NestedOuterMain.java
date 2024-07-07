package section07.nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Netsted nested = new NestedOuter.Netsted();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
