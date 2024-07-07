package section07.nested.nested.ex1;

//Network 객체 안에서만 사용
public class NetworkMessage {

    private String context;

    public NetworkMessage(String context) {
        this.context = context;
    }

    public void print() {
        System.out.println(context);
    }
}
