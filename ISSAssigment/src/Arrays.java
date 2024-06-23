import java.util.logging.Logger;

public class Arrays {
    private static Logger logger= Logger.getLogger("Arrays.class");
    public static void main(String[] args) {
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        logger.info("May has "+month_days[4]+" days");

        int a[]={4,7,90,32,45};
        int average=0;
        for(int i=0;i<a.length;i++) average+=a[i];
        logger.info("Average is: "+average/a.length);

    }
}
