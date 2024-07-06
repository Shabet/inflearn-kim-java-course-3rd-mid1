package section09.exception.ex2;

public class NetworkClientExeptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExeptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
