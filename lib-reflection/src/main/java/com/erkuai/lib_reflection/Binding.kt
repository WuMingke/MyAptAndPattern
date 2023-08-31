package com.erkuai.lib_reflection

import android.app.Activity

class Binding {

    companion object {
        // 反射的方式实现ButterKnife
        // 如果有很多属性的话，会反射很多次，而使用apt，只会反射一次

//        fun bind(activity: Activity) {
//            activity.javaClass.declaredFields.forEach { field ->
//                field.getAnnotation(BindView::class.java)?.let { bindView ->
//                    field.isAccessible = true
//                    field.set(activity, activity.findViewById(bindView.id))
//                }
//            }
//        }


        // apt实现ButterKnife

        fun bind(activity: Activity) {

            // 第一步，生成 MainActivityBinding 类
            val clazz = Class.forName("${activity.javaClass.canonicalName}Binding")
            val constructor = clazz.getDeclaredConstructor(activity.javaClass)
            constructor.newInstance(activity)
            // 第二步，在apt生成的方法里 findViewById


        }
    }
}