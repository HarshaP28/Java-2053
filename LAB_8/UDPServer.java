package LabPractise8;

//UDPServer.java
import java.net.*;

public class UDPSever {
 public static void main(String[] args) {
     try {
         DatagramSocket socket = new DatagramSocket(6000);
         byte[] receiveData = new byte[1024];

         System.out.println("UDP Server started. Waiting for message...");

         // Receive packet
         DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
         socket.receive(receivePacket);
         String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
         System.out.println("Client says: " + message);

         // Send reply
         String reply = "Hello UDP Client!";
         byte[] sendData = reply.getBytes();
         InetAddress clientAddress = receivePacket.getAddress();
         int clientPort = receivePacket.getPort();
         DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
         socket.send(sendPacket);

         socket.close();
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
