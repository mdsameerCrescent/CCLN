// Get Remote Host IP
// This program helps us to get the host and ip address fo an remote server.
import java.net.*;

public class GetRemoteIP {
    public static void main(String[] args) throws Exception{
        InetAddress remote = InetAddress.getByName("google.com");
        System.out.println("Host: "+ remote.getHostName());// Host : google.com
        System.out.println("IP: "+ remote.getHostAddress());// IP: 172.217.24.174
    }
}
