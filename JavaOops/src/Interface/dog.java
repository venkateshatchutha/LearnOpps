package Interface;

public class dog extends animal implements runnable{
    @Override
    public void sayName(String Name){
        System.out.println(Name+" dog bow..bow");
    }
    @Override
    public void run(){
        System.out.println("dog running");
    }

    public void dogheight(){
        System.out.println("height 1");
    }
}
