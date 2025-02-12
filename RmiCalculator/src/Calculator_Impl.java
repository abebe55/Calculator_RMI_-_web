import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator_Impl extends UnicastRemoteObject implements Calculator {
    protected Calculator_Impl() throws RemoteException {
        super();
    }

    public int add(int x, int y) throws RemoteException {
        return x + y;
    }

    public int subtract(int x, int y) throws RemoteException {
        return x - y;
    }

    public int multiply(int x, int y) throws RemoteException {
        return x * y;
    }

    public int divide(int x, int y) throws RemoteException {
        if (y == 0) {
            throw new ArithmeticException("Numbers does not Divided by zero");
        }
        return x / y;
    }
}