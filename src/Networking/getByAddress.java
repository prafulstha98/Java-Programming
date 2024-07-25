package Networking;

import java.net.InetAddress;
import java.util.Arrays;

public class getByAddress {
    public static void main(String[] args) throws Exception{
        byte[] address = {107,23,(byte)216,(byte)196};
        InetAddress addr = InetAddress.getByAddress("Localhost",address);
        System.out.println(Arrays.toString(addr.getAddress()));
    }
}
