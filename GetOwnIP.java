/* Get Localhost IP*/
// This program helps to get the localhost hostname and ip address


import java.net.*;


public class GetOwnIP {
    public static void main(String[] args) throws Exception {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Host: " + local.getHostName()); // Host: DESKTOP-FG1JD3B
        System.out.println("IP: " + local.getHostAddress()); // IP: 172.20.105.48
    }
}