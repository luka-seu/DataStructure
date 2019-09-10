package com.plasticlove.base.singleton;

/**
 * @author luka-seu
 * @description 懒汉单例模式
 * @create 2019-09 10-23:09
 **/

public class LazySingleton {
    /**
     * 存在的问题：
     * 1. 线程不安全
     */
    //构造方法私有
    private LazySingleton(){}
    private static LazySingleton singleton = null;
    public static LazySingleton getInstance(){
        if (singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
