package Networking;


import java.net.InetAddress;

public class Client {
    public static void main(String[] args) {
        try{
            //get InetAddress object for a specific hostname
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());

            //get all InetAddress associated with a hostname
            InetAddress[] allAddress = InetAddress.getAllByName("www.youtube.com");
            for(InetAddress addr : allAddress){
                System.out.println("IP Address: " + addr.getHostAddress());
            }

            //get InetAddress for the local host
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localAddress.getHostName());
            System.out.println("Local IP Address: " + localAddress.getHostAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
