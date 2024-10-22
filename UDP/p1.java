import java.net.*;


class p1{
public static void main(String[] args){
    
    try{
        String str = "I'm process1";
        DatagramSocket ds = new DatagramSocket(1025);
        byte[] data = str.getBytes();
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 1027);
        ds.send(dp);
        byte[] buffer = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(buffer, buffer.length);
        ds.receive(dp1);
        String str2 = new String(dp1.getData(),0,dp1.getLength());
        System.out.printf("Received packet from process2: %s\n",str2);
        ds.close();
    }catch(Exception e){
        System.out.println(e);
    }

    
}
}