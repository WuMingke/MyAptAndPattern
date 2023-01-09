package com.erkuai.myaptandpattern.pattern

import java.io.Serializable


class Pattern {

    fun test1() {
//        val list:List<Object> = List<String>();

        val wrapper = Wrapper<String>()
        wrapper.instance = "111"
    }
}

/************泛型的创建*****************/

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

/************泛型的实例化*****************/

interface Fruit

class Orange : Fruit

class Banana : Fruit

val fruits: ArrayList<out Fruit> = ArrayList<Orange>() // <? extends Fruit> 读
val fruits1: ArrayList<in Orange> = ArrayList<Fruit>() // <? super Fruit> 写

/************泛型方法和类型推断*****************/

interface RecycleShop<M> : Shop<M> {

    fun <E> recycle(item: E): List<M> // 回收E，返回M的列表；不在类名后声明，使得方法接收的参数更灵活
    fun <E> recycle(item: E): List<M> where E : Serializable, E : Apple // 泛型的多重约束，where关键字连接，不管是类or方法，都写在最后

}

/**
 * 泛型的主要作用在于 类型检查和自动转型
 *
 * 类型推断：泛型在实例化的时候，程序可以自动推断出类型参数的实际类型，从而不用手动指明类型
 *  泛型实例化，就是把泛型确定类型
 *
 * 泛型方法：方法自己声明了属于自己的泛型参数
 */

/************泛型到底什么情况下使用*****************/

/**
 * 类型检查和自动转型
 *
 * 类型约束
 *  多重限制的场景下，Java使用 &，Kotlin使用 where 关键字
 */

/************T <> ? extends super，位置/写法*****************/

/**
 * T
 *  类名/接口名 的右边，表示声明
 *  在类名/接口内部（方法的返回值、参数类型、成员变量（接口里面不行，因为接口的成员变量都是static final的））使用
 *  方法开头
 *
 * <>
 *  只是对类型包裹
 *
 * ？
 *  扩展 Type Argument 的范围
 *
 *
 *
 * Parameter 形参
 * Argument 实参
 */




