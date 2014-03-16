package practicasHilos;

import java.io.*;
import java.net.*; 
import java.util.*;

public class ChatServer {
    private static final int PUERTO = 8008;

    /** List of print writers associated with current clients,
     * one for each. */
    private List<PrintWriter> clients;

    public ChatServer() {
        clients = new LinkedList<PrintWriter>();
    }

    public void start() {
        try {
            ServerSocket s = new ServerSocket(PUERTO); 
            for (;;) {
                Socket incoming = s.accept(); 
                new ClientHandler(incoming).start(); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("AndyChat server stopped."); 
    }

    /** Adds a new client identified by the given print writer. */
    private void addClient(PrintWriter out) {
        synchronized(clients) {
            clients.add(out);
        }
    }

    /** Adds the client with given print writer. */
    private void removeClient(PrintWriter out) {
        synchronized(clients) {
            clients.remove(out);
        }
    }

    /** Broadcasts the given text to all clients. */
    private void broadcast(String msg) {
        for (PrintWriter out: clients) {
            out.println(msg);
            out.flush();
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            System.exit(-1);
        }
        new ChatServer().start();
    }

    /** A thread to serve a client. This class receive messages from a
     * client and broadcasts them to all clients including the message
     * sender. */
    private class ClientHandler extends Thread {

        /** Socket to read client messages. */
        private Socket incoming; 

        /** Creates a hander to serve the client on the given socket. */
        public ClientHandler(Socket incoming) {
            this.incoming = incoming;
        }

        /** Starts receiving and broadcasting messages. */
        public void run() {
            PrintWriter out = null;
            try {
                out = new PrintWriter(
                        new OutputStreamWriter(incoming.getOutputStream()));
                
                // inform the server of this new client
                ChatServer.this.addClient(out);

                out.print("Welcome to AndyChat! ");
                out.println("Enter BYE to exit."); 
                out.flush();

                BufferedReader in 
                    = new BufferedReader(
                        new InputStreamReader(incoming.getInputStream())); 
                for (;;) {
                    String msg = in.readLine(); 
                    if (msg == null) {
                        break; 
                    } else {
                        if (msg.trim().equals("BYE")) 
                            break; 
                        System.out.println("Received: " + msg);
                        // broadcast the receive message
                        ChatServer.this.broadcast(msg);
                    }
                }
                incoming.close(); 
                ChatServer.this.removeClient(out);
            } catch (Exception e) {
                if (out != null) {
                    ChatServer.this.removeClient(out);
                }
                e.printStackTrace(); 
            }
        }
    }
}
