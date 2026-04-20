import java.net.*;
import java.io.*;

public class Serverarp {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(
            new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

        String ip = br.readLine();

        if(ip.equals("192.168.1.1"))
            pw.println("AA:BB:CC:DD");

        s.close();
        ss.close();
    }
}
