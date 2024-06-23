import java.util.logging.Logger;

public class Constructors {
    private String studentName;
    private int rollNo;
    private double englishMarks;
    //default constructor
    Constructors(){
        this.studentName="XYZ";
        this.rollNo=0;
        this.englishMarks=5;
    }
    //parameterized constructor
    Constructors(String studentName, int rollNo, double englishMarks){
        this.studentName=studentName;
        this.rollNo=rollNo;
        this.englishMarks=englishMarks;
    }

    Constructors(String studentName, double englishMarks){
        this.studentName=studentName;
        this.englishMarks=englishMarks;
    }
    private static Logger logger= Logger.getLogger("Constructors.class");
    public void displayDetails(){
        logger.info("Student Name: "+this.studentName);
        logger.info("Roll number: "+this.rollNo);
        logger.info("English marks: "+this.englishMarks);
    }

    public static void main(String args[]){
        Constructors student1=new Constructors();
        Constructors student2=new Constructors("John",10,92.0);
        Constructors student3=new Constructors("James",87.0);

        logger.info("Details of 1st student");
        student1.displayDetails();

        logger.info("Details of 2nd student");
        student2.displayDetails();

        logger.info("Details of 3rd student");
        student3.displayDetails();
    }
}
