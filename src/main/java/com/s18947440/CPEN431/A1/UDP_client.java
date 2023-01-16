package com.s18947440.CPEN431.A1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDP_client {

    int port;
    InetAddress address;
    //String hostname = "34.213.181.35";

    DatagramSocket socket = null;
    DatagramPacket packet;
    byte[] sendBuf = new byte[256];

    InetAddress ia;

    public UDP_client(String hostname) throws UnknownHostException{
        ia = InetAddress.getByName(hostname);
        System.out.println(ia.getHostName());

    }

}
