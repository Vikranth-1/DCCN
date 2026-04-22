import java.util.*;

class Email {
    public static void main(String[] args) {
        List<String> inbox = new ArrayList<>();

        inbox.add("Hello");
        System.out.println("Inbox: " + inbox);

        inbox.remove(0);
        System.out.println("After delete: " + inbox);
    }
}
