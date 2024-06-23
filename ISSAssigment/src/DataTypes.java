import java.util.logging.Logger;

public class DataTypes {
    private static Logger logger= Logger.getLogger("DataTypes.class");
    public static void main(String[] args) {

        // char type
        char charValue = 'G';
        logger.info("charValue: " + charValue);

        // byte type
        //-128 to 127
        byte byteValue = 62;
        logger.info("byteValue: " + byteValue);

        // int type
        int intValue = 44567;
        logger.info("intValue: " + intValue);

        // short type
        //-32,768 to 32,767
        short shortValue = 23300;
        logger.info("shortValue: " + shortValue);

        // float type
        float floatValue = 10.56736645f;
        logger.info("floatValue: " + floatValue);

        // long type
        long longValue = 100000L;
        logger.info("longValue: " + longValue);

        // double type
        double doubleValue = 10.56736645676d;
        logger.info("doubleValue: " + doubleValue);

        // boolean type
        boolean booleanValue = true;
        logger.info("booleanValue: " + booleanValue);

    }
}
