import java.net.*;

public class Serverrarp {
    public static void main(String args[]) throws Exception {
        DatagramSocket server = new DatagramSocket(1309);

        byte[] receive = new byte[1024];
        DatagramPacket dp = new DatagramPacket(receive, receive.length);
        server.receive(dp);

        String mac = new String(dp.getData()).trim();

        String ip = "192.168.1.1";

        byte[] send = ip.getBytes();
        DatagramPacket dp2 = new DatagramPacket(send, send.length,
                dp.getAddress(), dp.getPort());

        server.send(dp2);
        server.close();
    }
}
