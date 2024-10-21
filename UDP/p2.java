import java.net.*;

public class p2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1025);
        byte[] data_from_p1 = new byte[1024];
        // byte[] data = "I'm process2".getBytes();
        DatagramPacket dp = new DatagramPacket(data_from_p1, data_from_p1.length);
        System.out.println("Waiting for packet from process1");
        ds.receive(dp);
        ds.close();
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.printf("Received packet from process1: %s\n",str);
    }
}