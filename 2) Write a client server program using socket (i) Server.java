import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is listening...");

            Socket socket = serverSocket.accept();

            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String msg = input.readLine();
            System.out.println("Client: " + msg);

            output.println("Echo: " + msg);

            socket.close();
            serverSocket.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
