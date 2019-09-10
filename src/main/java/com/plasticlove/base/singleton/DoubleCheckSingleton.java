package com.plasticlove.base.singleton;

/**
 * @author luka-seu
 * @description 双重校验锁
 * @create 2019-09 10-23:11
 **/

public class DoubleCheckSingleton {

    private DoubleCheckSingleton(){}
    //volatile解决重排序的问题
    private volatile static DoubleCheckSingleton singleton = null;

    public static DoubleCheckSingleton getInstance(){
        if (singleton==null){ //第一次校验为了提高并发能力，不然如果单例对象已经创建，但每次都要去获取锁。减少开销
            synchronized (DoubleCheckSingleton.class){
                if (singleton==null){//第二次校验为了解决线程竞争的问题
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
