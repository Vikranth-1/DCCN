import java.util.*;

class SlidingWindow {
    public static void main(String[] args) {
        int windowSize = 3;
        int[] frames = {1,2,3,4,5};

        for(int i=0;i<frames.length;i+=windowSize){
            System.out.print("Sending: ");
            for(int j=i;j<i+windowSize && j<frames.length;j++){
                System.out.print(frames[j]+" ");
            }
            System.out.println("\nACK received");
        }
    }
}
