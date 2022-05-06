package Interface;

public class Slowrunningbehaviour implements runningbehaviour{

    @Override
    public void run() {
        System.out.println("Slow Running");
    }
}
