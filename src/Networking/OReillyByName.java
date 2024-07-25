package Networking;
import java.net.*;

public class OReillyByName {
    public static int getVersion(InetAddress la){
        byte[] address = la.getAddress();
        if(address.length == 4) return 4;
        else if(address.length == 16) return 6;
        else return -1;
    }
}
