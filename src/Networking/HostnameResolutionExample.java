package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostnameResolutionExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Host Address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Host not found.");
            e.printStackTrace();
        }
    }
}
