package Interface;

public class horse extends animal implements runnable{
    runningbehaviour runningbehaviour = new fastrunningbehaviour();

    @Override
    public void run() {
        runningbehaviour.run();
    }
}
