import java.util.logging.Logger;

public class DecisionMaking {
    private static Logger logger= Logger.getLogger("DecisionMaking.class");
    public static void main(String[] args) {
        int x=80;

        if(x>0){
            logger.info("Positive Number "+x);
        } else if(x<0){
            logger.info("Negative Number "+x);
        } else{
            logger.info("Zero");
        }

        if(x%2==0){
            logger.info(x+" is even");
        }else{

                logger.info(x+" is odd");

        }

        int day = 5;
        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }
        logger.info("Day of the week: " + dayString);
    }
}
