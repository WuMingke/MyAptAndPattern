package com.erkuai.myaptandpattern.pattern

import java.util.Objects

class Pattern {

    fun test1() {
//        val list:List<Object> = List<String>();

        val wrapper = Wrapper<String>()
        wrapper.instance = "111"
    }
}

//1
class Wrapper<T> {
    var instance: T? = null

    // 不能有static修饰的变量、方法，因为泛型类型是针对具体的对象的，不针对静态对象和静态方法，静态对象和静态方法也根本取不到类型
    // 但是方法可以有自己的泛型，静态方法也可以有

}

//2
interface Shop<T> {
    fun buy(): T?
    fun refund(item: T): Float
}

open class Apple

class AppleShop : Shop<Apple> { // 这里已经实例化了泛型
    override fun buy(): Apple? {
        return null
    }

    override fun refund(item: Apple): Float {
        return 0f
    }

}

interface RepairableShop<M> : Shop<M> { // 保留泛型信息
    fun repair(item: M)
}

class AppleRepairableShop : RepairableShop<Apple> {
    override fun buy(): Apple? {
        return null
    }

    override fun refund(item: Apple): Float {
        return 0f
    }

    override fun repair(item: Apple) {
    }
}

// 多个类型参数
class MyHashMap<K, V> {
    fun put(key: K, value: V) {

    }
}

// 给已有类型增加泛型
class ApplePlusShop<M, N : Apple> : Shop<M> { // 这里N 还限制了类型
    override fun buy(): M? {
        return null
    }

    override fun refund(item: M): Float {
        return 0f
    }

    fun plusService(item: N) {

    }
}






