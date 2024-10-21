import java.net.*;


class p1{


public static void main(String[] args){
    String str = "I'm process1";
    try{
        DatagramSocket ds = new DatagramSocket();
        byte[] data = str.getBytes();
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 1025);
        ds.send(dp);
        System.out.println("sent packet to process2");  
        ds.close();
    }catch(Exception e){
        System.out.println(e);
    }

    
}
}