package section03.lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        //코드 작성
        String[] split = email.split("@");
        System.out.println("ID: " + split[0]);
        System.out.println("Domain: " + split[1]);
    }
}
