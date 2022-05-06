package Interface;

public class husky extends dog implements runnable{
    runningbehaviour runningbehaviour=new fastrunningbehaviour();
    @Override
    public void sayName(String Name){
        System.out.println(Name+" Husky bow..bow");
    }
    public void run(){
        runningbehaviour.run();
        System.out.println("husky running");
    }
    public void huckylegs(){
        System.out.println("husky legs 4");
    }
}
