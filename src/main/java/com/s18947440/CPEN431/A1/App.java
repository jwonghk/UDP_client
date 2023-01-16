package com.s18947440.CPEN431.A1;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException {

        System.out.println("Hello World!\n");

        String currentHostAddr;
        String hostname = "34.213.181.35";
        UDP_client udpc = new UDP_client(hostname);
        System.out.println("local host address " + InetAddress.getLocalHost().getHostAddress());
        currentHostAddr = InetAddress.getLocalHost().getHostName();
        //System.out.println(InetAddress.getHostName());

        Socket socket;
    }
}
