import java.util.logging.Logger;

public class LoopContol {
    private static Logger logger= Logger.getLogger("LoopControl.class");
    public static void main(String args[]) {
        logger.info("For loop");
        for(int index=0;index<=7;index++)   logger.info(index+" ");

        int i=1;
        logger.info("While loop");
        while(i<=7){
            logger.info(i+" ");
            i++;
        }

        int j=1;
        logger.info("Do While loop");
        do{
            logger.info(j+" ");
            j++;
        }while (j!=7);
    }
}
