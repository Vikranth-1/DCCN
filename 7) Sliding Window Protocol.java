class SlidingWindow {

    private int totalFrames;
    private int windowSize;
    private int sent;

    SlidingWindow(int totalFrames, int windowSize) {
        this.totalFrames = totalFrames;
        this.windowSize = windowSize;
        this.sent = 0;
    }

    void sendFrames() {
        System.out.print("Sender: Sending frames: ");
        for (int i = sent; i < sent + windowSize && i < totalFrames; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    void receiveFrames() {
        System.out.print("Receiver: Received frames: ");
        for (int i = sent; i < sent + windowSize && i < totalFrames; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    void sendAck() {
        int ack = Math.min(sent + windowSize, totalFrames);
        System.out.println("Receiver: Sending ACK for frame " + ack);
    }

    void slideWindow() {
        sent += windowSize;
        System.out.println("Sender: Window Slid!\n");
    }

    void start() {
        while (sent < totalFrames) {
            sendFrames();
            receiveFrames();
            sendAck();
            slideWindow();
        }
    }
}

class SlidingWindowProtocol {
    public static void main(String[] args) {
        SlidingWindow sw = new SlidingWindow(7, 3);
        sw.start();
    }
}