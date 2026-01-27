//Port Scanner
// This Programs helps to cheak the open ports using TCP

import java.net.*;


public class PortScanner {
    public static void main(String[] args) {
        for (int port =1000;port<=5000;port++){
            try{
                Socket s = new Socket("localhost", port);
                System.out.println("Port "+port+" is Open.");
                s.close();
            } catch (Exception e){
                System.out.println(port+" is not Ports Open!");
            }        
        }
    }
}


//In the Computer this program ran doesnt have a opened ports in the system.