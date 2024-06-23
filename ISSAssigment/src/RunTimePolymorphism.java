class parent {
    public void work() {
        System.out.println("Parent is under retirement from work.");
    }
}
class child extends parent {
    @Override
    public void work() {
        System.out.println("Child has a job");
        System.out.println(" He is doing it well");
    }
}
public class RunTimePolymorphism {
    public static void main(String argu[]) {
        child c1 = new child();
        c1.work();
    }
}
