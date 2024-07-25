package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println("Host Address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Host not found.");
            e.printStackTrace();
        }
    }
}