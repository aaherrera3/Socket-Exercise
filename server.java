import java.net.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;

/**
 * server
 */
public class server {

    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(4999);
        Socket socket = serverSocket.accept();

        System.out.println("Client connected");

        InputStreamReader in = new InputStreamReader(socket.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        PrintWriter pr = new PrintWriter(socket.getOutputStream());

        Boolean flag = true;
        while(flag){
            String key = bf.readLine();

            switch (key.toLowerCase()) {
                case "what time is it?":
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime date = LocalDateTime.now();
                    pr.println(dtf.format(date));
                    pr.flush();
                    break;
                case "goodbye":
                    pr.println("GoodBye");
                    pr.flush();
                    flag = false;
                    serverSocket.close();
                    socket.close();
                    break;
                default:
                    pr.println("Sorry I dont understand.");
                    pr.flush();
                    break;
            }
        }
        
    }
}