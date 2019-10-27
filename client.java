import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
 * client
 */
public class client {

    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost", 4999);
        
        PrintWriter pr = new PrintWriter(socket.getOutputStream());

        InputStreamReader in = new InputStreamReader(socket.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        Scanner scaner = new Scanner(System.in);

        Boolean flag = true;
        System.out.println("System ready for input:");
        while(flag){
            pr.println(scaner.nextLine());
            pr.flush();
            String key = bf.readLine();

            switch (key.toLowerCase()) {
                case "goodbye":
                    System.out.println("Server: "+ key);
                    flag = false;
                    socket.close();
                    scaner.close();
                    break;
            
                default:
                    System.out.println("Server: "+ key);
                    System.out.println("\nSystem ready for input:");
                    break;
            }
        }
        
    }
}