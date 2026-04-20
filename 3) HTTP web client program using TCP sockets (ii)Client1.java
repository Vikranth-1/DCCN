import java.net.*;
import java.io.*;

public class Client1 {
    public static void main(String args[]) throws Exception {
        Socket socket = new Socket("localhost",4000);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        int len = dis.readInt();

        byte[] data = new byte[len];
        dis.readFully(data);

        System.out.println("Received file size: " + len);

        dis.close();
        socket.close();
    }
}
