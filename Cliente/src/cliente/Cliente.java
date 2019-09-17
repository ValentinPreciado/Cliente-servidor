
package cliente;
import java.net.*;
import java.io.*;
        

public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket ("127.0.0.1",2001);
        PrintWriter escritor = new PrintWriter (
                socket.getOutputStream(), true 
        
        );
        
        escritor.println(" mundo");
        socket.close();
    }
    
}
