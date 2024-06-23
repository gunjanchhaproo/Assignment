import java.util.logging.Logger;

public class FinalKeyword {
    public static final double PI = 3.14;
    private static Logger logger= Logger.getLogger("FinalKeyword.class");
    public static void main(String[] args) {
//        PI=3.1;//this will cause an error
        logger.info("Area of circle if radius is 5:"+5*5*PI);
    }
}
