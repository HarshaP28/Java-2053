package LabPractise8;

//UDPClient.java
import java.net.*;

public class UDPClient {
 public static void main(String[] args) {
     try {
         DatagramSocket socket = new DatagramSocket();
         InetAddress address = InetAddress.getByName("localhost");

         // Send message to server
         String message = "Hello UDP Server!";
         byte[] sendData = message.getBytes();
         DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, address, 6000);
         socket.send(sendPacket);

         // Receive reply
         byte[] receiveData = new byte[1024];
         DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
         socket.receive(receivePacket);
         String reply = new String(receivePacket.getData(), 0, receivePacket.getLength());
         System.out.println("Server says: " + reply);

         socket.close();
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
