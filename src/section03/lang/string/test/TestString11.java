package section03.lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        //코드 작성
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}
