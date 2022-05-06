package Interface;

import com.sun.xml.internal.ws.api.WSDLLocator;

public class tortoise implements runnable{
    runningbehaviour runningbehaviour=new Slowrunningbehaviour();
    @Override
    public void run(){
        runningbehaviour.run();
    }
}
