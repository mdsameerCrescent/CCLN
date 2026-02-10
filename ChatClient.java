import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {
        try {
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String username = keyboard.readLine();

            Socket socket = new Socket("172.20.105.42", 5000);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Thread to receive messages
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (Exception e) {
                    System.out.println("Disconnected from server.");
                }
            }).start();

            // Send messages
            String input;
            while ((input = keyboard.readLine()) != null) {
                out.println(username + ": " + input);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
