import java.net.*;

public class Serverdns {
    public static void main(String args[]) throws Exception {
        DatagramSocket server = new DatagramSocket(1309);

        byte[] receive = new byte[1024];
        DatagramPacket dp = new DatagramPacket(receive, receive.length);
        server.receive(dp);

        String msg = new String(dp.getData()).trim();

        String response = "Unknown";
        if(msg.equals("google.com"))
            response = "142.250.183.14";

        byte[] send = response.getBytes();
        DatagramPacket dp2 = new DatagramPacket(send, send.length,
                dp.getAddress(), dp.getPort());

        server.send(dp2);
        server.close();
    }
}
