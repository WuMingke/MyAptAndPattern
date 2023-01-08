package com.erkuai.lib_reflection


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class BindView(val id: Int)
