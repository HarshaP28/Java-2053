package LabPractise8;

//Server.java
import java.io.*;
import java.net.*;

public class Server {
 public static void main(String[] args) {
     try {
         // Create a ServerSocket listening on port 5000
         ServerSocket serverSocket = new ServerSocket(5000);
         System.out.println("Server started. Waiting for client...");

         // Accept client connection
         Socket socket = serverSocket.accept();
         System.out.println("Client connected!");

         // Get input and output streams
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

         // Read message from client
         String message = in.readLine();
         System.out.println("Client says: " + message);

         // Send reply
         out.println("Hello Client, message received!");

         // Close connections
         in.close();
         out.close();
         socket.close();
         serverSocket.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

