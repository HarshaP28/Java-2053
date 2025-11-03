package LabPractise8;

//Client.java
import java.io.*;
import java.net.*;

public class Client {
 public static void main(String[] args) {
     try {
         // Connect to server at localhost and port 5000
         Socket socket = new Socket("localhost", 5000);

         // Get input and output streams
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

         // Send message to server
         out.println("Hello Server, this is Client!");

         // Read reply from server
         String response = in.readLine();
         System.out.println("Server says: " + response);

         // Close connections
         in.close();
         out.close();
         socket.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
