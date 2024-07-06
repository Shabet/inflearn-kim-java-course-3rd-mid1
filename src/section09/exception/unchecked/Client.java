package section09.exception.unchecked;

public class Client {

    public void call() {
        throw new MyUncheckedException("ex");
    }
}
