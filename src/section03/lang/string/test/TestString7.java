package section03.lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String original = "     Hello java    ";
        String trimmed = original.strip();
        System.out.println("trimmed = >" + trimmed + "<");
    }
}
