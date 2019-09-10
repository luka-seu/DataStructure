package com.plasticlove.base.singleton;

/**
 * @author luka-seu
 * @description 饿汉模式
 * @create 2019-09 10-23:06
 **/

public class HungryModeSingleton {
    /**
     * 存在的问题：
     * 1. 类加载的时候对象已被创建，应该改为懒加载
     * 2. 没有同步，线程不安全
     */

    //构造方法私有
    private HungryModeSingleton(){}
    private static HungryModeSingleton singleton = new HungryModeSingleton();
    public static HungryModeSingleton getInstance(){
        return singleton;
    }

}
