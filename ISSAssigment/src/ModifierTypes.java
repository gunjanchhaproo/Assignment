import java.util.logging.Logger;

public class ModifierTypes {
    // Public double variable
    public double publicDouble = 3.14;

    // Private double variable
    private double privateDouble = 2.718;

    // Protected double variable
    protected double protectedDouble = 1.618;

    // Default (package-private) double variable
    double defaultDouble = 0.576;

    private static Logger logger= Logger.getLogger("ModifierTypes.class");


    public void displayPublicDouble() {
        logger.info("Public double: " + publicDouble);
    }

    private void displayPrivateDouble() {
        logger.info("Private double: " + privateDouble);
    }

    protected void displayProtectedDouble() {
        logger.info("Protected double: " + protectedDouble);
    }

    void displayDefaultDouble() {
        logger.info("Default double: " + defaultDouble);
    }

    public static void main(String[] args) {
        ModifierTypes m1=new ModifierTypes();
        m1.displayDefaultDouble();
        m1.displayPrivateDouble();
        m1.displayProtectedDouble();
        m1.displayPublicDouble();

    }
}
