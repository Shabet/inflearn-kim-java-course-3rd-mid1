package section09.exception.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}