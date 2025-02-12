import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Calculator_Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1093);
            Calculator_Impl calc = new Calculator_Impl();
            Naming.rebind("CalculatorService", calc);
            System.out.println("Calculator Service is ready.");
        } catch (Exception e) {
            System.out.println("Calculator Server failed: " + e);
        }
    }
}

