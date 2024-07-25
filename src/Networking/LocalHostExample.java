package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHostExample {
    public static void main(String[] args) {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localAddress.getHostName());
            System.out.println("Local Host Address: " + localAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Local host information could not be determined.");
            e.printStackTrace();
        }
    }
}