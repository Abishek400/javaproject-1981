import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplExample implements Hello {

    public void printMsg() {
        System.out.println("This is an example RMI program");
    }
}