import java.util.*;

class DHCP {
    public static void main(String[] args) {
        List<String> pool = new ArrayList<>();
        pool.add("192.168.1.10");
        pool.add("192.168.1.11");

        System.out.println("Client1: " + pool.remove(0));
        System.out.println("Client2: " + pool.remove(0));
    }
}
