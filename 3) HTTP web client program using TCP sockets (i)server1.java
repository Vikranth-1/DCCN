import java.net.*;
import java.io.*;

public class Server1 {
    public static void main(String args[]) throws Exception {
        ServerSocket server = new ServerSocket(4000);
        Socket socket = server.accept();

        File file = new File("test.txt");
        FileInputStream fis = new FileInputStream(file);

        byte[] data = fis.readAllBytes();

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(data.length);
        dos.write(data);

        dos.close();
        socket.close();
        server.close();
    }
}
