import java.util.logging.Logger;

class Box{
    private double width;
    private double height;
    private double depth;
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolumne(){
        return this.depth*this.width*this.height;
    }
}

public class ObjectEx {
    private static Logger logger= Logger.getLogger("ObjectEx.class");
    public static void main(String args[]){
        Box b1=new Box();
        Box b2=new Box();

        b1.setWidth(10.0);
        b1.setDepth(20.0);
        b1.setHeight(30);
        double vol=b1.getDepth()*b1.getHeight()* b1.getWidth();
        logger.info("Volume is:"+vol);

        logger.info("Volume of box 2 is:"+b2.getVolumne());
    }
}
