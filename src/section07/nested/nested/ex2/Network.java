package section07.nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {

        private String context;

        public NetworkMessage(String context) {
            this.context = context;
        }

        public void print() {
            System.out.println(context);
        }
    }
}
