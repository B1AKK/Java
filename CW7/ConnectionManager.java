import java.util.Scanner;

public class ConnectionManager {

    private class Connection{
        String address;
        int port;
        String name;

        public Connection(String address, int port, String name) {
                this.address = address;
                this.port = port;
                this.name = name;
        }

        @Override
        public String toString() {
            return this.name + " " + this.address + " " + this.port;
        }
    }

    private Connection[] connections;
    private int number = 0;
    private int maxConnections = 100;

    ConnectionManager() {
        connections = new Connection[maxConnections];
    }

    ConnectionManager(int maxConnections) {
        this.maxConnections = maxConnections;
        connections = new Connection[maxConnections];
    }

    public boolean addConnection(String address, int port, String name) {
        if (number >= maxConnections) return false;

        Connection conn = new Connection(address, port, name);
        connections[number++] = conn;

        return true;
    }

    public boolean processConnect() {
        if (number <= 0) return false;

        System.out.println("Get connect: " + connections[number-- -1]);

        return true;
    }
    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        ConnectionManager manager = new ConnectionManager();
        System.out.print("Input number of connections: ");
        int n = scan.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Address: ");
            String address = scan.next();
            System.out.print("port: ");
            int port = scan.nextInt();
            System.out.print("name: ");
            String name = scan.next();
            manager.addConnection(address, port, name);
        }
        while (manager.processConnect()) continue;
    }
}
