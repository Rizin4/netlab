import java.io.*;
import java.net.*;

class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(1346);
            System.out.println("Waiting for request....");

            Socket socket = serversocket.accept();
            System.out.println("Request Accepted...");

            PrintStream ps = new PrintStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Input the data at the server...");

            ps.print(br.readLine());

            socket.close();
            serversocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
