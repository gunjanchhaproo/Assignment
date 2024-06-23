import java.util.logging.Logger;

public class Strings {
    private static Logger logger= Logger.getLogger("Strings.class");
    public static void main(String[] args) {
        String str1 = "JAVA is difficult";
        String str2 = new String("JAVA is difficult");

        int length = str1.length();

        char charat = str1.charAt(6);

        boolean isEqual = str1.equals(str2);

        String modifiedStr = str1.replace('f', 'e');

        logger.info("Length of String: " + length);
        logger.info("Character at 6th position: " + charat);
        logger.info("Is equal: " + isEqual);
        logger.info("Modified String: " + modifiedStr);
    }
}
