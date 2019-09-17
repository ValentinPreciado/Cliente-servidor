
package server;
import java.net.*;
import java.io.*;


public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        ServerSocket socketServidor= new ServerSocket (2001);
        Socket socket = socketServidor.accept();
        
        BufferedReader lector = new BufferedReader (
                new InputStreamReader (socket.getInputStream())
        
        );
        String entrada;
        while ((entrada= lector.readLine())!=null){
            System.out.println("hola"+entrada);
        }
    }
    
    
}
