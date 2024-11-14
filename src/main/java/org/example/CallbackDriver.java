package org.example;

public class CallbackDriver {
    ICallBackable callback;
    public CallbackDriver(ICallBackable callback) {
        this.callback = callback;
    }
    public String executeCallback(){
        System.out.println("Callback Start");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("The Process is Complete");
        return callback.onComplete("The Task is Complete");
    }
}
