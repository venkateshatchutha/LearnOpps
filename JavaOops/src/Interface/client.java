package Interface;

public class client {
    public static void main(String[] args) {
        horse horse= new horse();
        tortoise tortoise=new tortoise();
        //tortoise.run();
        //horse.run();

        dog husky= new husky();
        husky.run();
        husky.sayName("newww");
        husky.dogheight();
        //husky.huckylegs(); not working because method is not defined in dog
    }
}
