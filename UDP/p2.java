import java.net.*;

public class p2 {
    public static void main(String[] args) {
    try{   
        DatagramSocket ds = new DatagramSocket(1027);
        byte[] data_from_p1 = new byte[1024];
        String str = "I'm process2";
        byte[] data = str.getBytes();
        DatagramPacket dp = new DatagramPacket(data_from_p1, data_from_p1.length);
        ds.receive(dp);
        String str_ = new String(dp.getData(),0,dp.getLength());
        System.out.printf("Received packet from process1: %s\n",str_);
        DatagramPacket dp1 = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 1025);
        ds.send(dp1);
        ds.close();
    }catch(Exception e){
        System.out.println(e);
    }

    }
}