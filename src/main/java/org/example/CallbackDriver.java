package org.example;

public class CallbackDriver<T> {
    ICallBackable<T> callback;
    T value;
    public CallbackDriver(ICallBackable<T> callback, T value) {
        this.callback = callback;
        this.value = value;
    }
    public T executeCallback(){
        System.out.println("Callback Start");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("The Process is Complete");
//        return callback.onComplete("The Task is Complete");
        return callback.onComplete(this.value);
    }
}
