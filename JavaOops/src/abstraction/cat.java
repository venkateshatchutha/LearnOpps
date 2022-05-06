package abstraction;

// thought cat implements animal
// but it's extends abstract class. interface and abstract are different
public class cat extends animal {
    @Override
    public void run(String name) {
        System.out.println("running");
    }
    /*@Override
    public void run(String name){
        System.out.println(name+" running fast");
    }*/

}
