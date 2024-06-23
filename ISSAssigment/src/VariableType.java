import java.util.logging.Logger;

public class VariableType {
    private static Logger logger= Logger.getLogger("VariableTypes.class");
    //static variable
    static int populationCount=0;
    //instance variable
    String name;

    VariableType(String name){
        this.name=name;
        populationCount++;
    }

    public void displayDetails(){
        //local variable
        int age=10;
        logger.info("Name "+this.name+" Age "+age+" Population Count:"+populationCount);
    }

    public static void main(String[] args) {
        VariableType v1=new VariableType("Harsh");
        VariableType v2=new VariableType("John");

        logger.info("Display Details of 1st object:");
        v1.displayDetails();

        logger.info("Display Details of 2nd object:");
        v2.displayDetails();
    }
}
